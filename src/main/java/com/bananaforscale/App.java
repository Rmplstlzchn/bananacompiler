package com.bananaforscale;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.File;
import java.io.PrintStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input;
        if (args.length > 0)
            input = new ANTLRFileStream(args[0]);
        else
            input = new ANTLRFileStream("code/demo.code");
        System.out.println(compile(input));
    }


    public static String compile(ANTLRInputStream input) {
        BananaCompilerLexer lexer = new BananaCompilerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BananaCompilerParser parser = new BananaCompilerParser(tokens);

        ParseTree tree = parser.prog();

        String text, result;
        //Loop (while not last line of source code && error != "writing jasmin file failed"
        BananaVisitor visitor = new BananaVisitor();
        text = createJasminFile((visitor.visit(tree)), visitor.getErrorMessage(), visitor.getIsCalculation());
        result = writeJasminFile(text); //override last result, always latest result stored in variable
        result = result + executeJasmin();
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
    private static String writeJasminFile(String text){

        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter("jasmin.j")));
            pw.println(text);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (pw != null){
                pw.flush();
                pw.close();
            }
            else{
                return "writing jasmin file failed\n";
            }
        }
        return "writing jasmin code successfully\n";
    }

    private static String executeJasmin(){
        try {
            Process proc = null;
            String file_path = null;

            file_path = new String("build.bat");

            proc = Runtime.getRuntime().exec("cmd /c start  " + file_path);
            return "executed successfully\n";
        }
        catch(Exception e){
            return "executing jasmin file failed\n ("+e.getMessage()+")";
        }
    }
}
