package com.bananaforscale;

import jasmin.ClassFile;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Compiler
{
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input;
        if (args.length > 0)
            input = new ANTLRFileStream(args[0]);
        else
            input = new ANTLRFileStream("code/demo.code");
        System.out.println(compile(input));
    }


    public static String compile(ANTLRInputStream input) throws Exception {
        BananaCompilerLexer lexer = new BananaCompilerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BananaCompilerParser parser = new BananaCompilerParser(tokens);

        ParseTree tree = parser.prog();

        String text, result;
        //Loop (while not last line of source code && error != "writing jasmin file failed"
        BananaVisitor visitor = new BananaVisitor();
        text = createJasminFile((visitor.visit(tree)), visitor.getErrorMessage(), visitor.getIsCalculation());
        writeJasminFile(text); //override last result, always latest result stored in variable
        result = executeJasmin(text);
        //Loop end

        //return latest result
        return result;
    }

    private static String createJasminFile(String instructions, String errorMessage, boolean calculation) {
        String output;
        if (!errorMessage.equals("")) {
            output = "getstatic java/lang/System/out Ljava/io/PrintStream;" + System.lineSeparator() + "ldc \"" + errorMessage + "\"" + System.lineSeparator() + "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V" + System.lineSeparator();
        } else {
            if (calculation == true) {
                output = "getstatic java/lang/System/out Ljava/io/PrintStream;" + System.lineSeparator() + instructions + System.lineSeparator() + "invokevirtual java/io/PrintStream/println(I)V" + System.lineSeparator();
            } else {
                output = instructions + System.lineSeparator();
            }
        }

        return ".class public Test" + System.lineSeparator() +
                ".super java/lang/Object" + System.lineSeparator() +
                ".method public static main([Ljava/lang/String;)V" + System.lineSeparator() +
                ".limit stack 100" + System.lineSeparator() +
                ".limit locals 100" + System.lineSeparator() +
                output +
                "return" + System.lineSeparator() +
                ".end method";
    }

    /**
     * writes the generated jasmin instructions in the file jasmin.j (path: bananacompiler/jasmin.j)
     */
    private static void writeJasminFile(String text){

        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter("code/jasmin.j")));
            pw.println(text);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (pw != null){
                pw.flush();
                pw.close();
            }
        }
    }

    public static String executeJasmin(String code) throws Exception {
        createTempDir();
        ClassFile classFile = new ClassFile();
        try {
            classFile.readJasmin(new StringReader(code), "", false);
        } catch (Exception e) {
            return "Failed to read bytecode: " + e.getMessage();
        }
        Path outputPath = tempDir.resolve(classFile.getClassName() + ".class");
        try {
            classFile.write(Files.newOutputStream(outputPath));
        } catch (Exception e) {
            return "Failed to write program: " + e.getMessage();
        }
        String result = runJavaClass(tempDir, classFile.getClassName());
        delete(tempDir.toFile());
        return result;
    }
    private static Path tempDir;
    public static void createTempDir() throws IOException {
        tempDir = Files.createTempDirectory("compilerTest");
    }
    public static void delete(File file) {
        if (file.isDirectory()) {
            //directory is empty, then delete it
            if (file.list().length == 0) {
                file.delete();
                System.out.println("Directory is deleted : "
                        + file.getAbsolutePath());
            } else {
                //list all the directory contents
                String files[] = file.list();
                for (String temp : files) {
                    //construct the file structure
                    File fileDelete = new File(file, temp);

                    //recursive delete
                    delete(fileDelete);
                }
                //check the directory again, if empty then delete it
                if (file.list().length == 0) {
                    file.delete();
                    System.out.println("Directory is deleted : "
                            + file.getAbsolutePath());
                }
            }
        } else {
            //if file, then delete it
            file.delete();
        }
    }
    private static String runJavaClass(Path dir, String className) throws Exception {
        Process process = Runtime.getRuntime().exec(new String[]{"java", "-cp", dir.toString(), className});
        InputStream in = process.getInputStream();
        return new Scanner(in).useDelimiter("\\A").next();
    }
}
