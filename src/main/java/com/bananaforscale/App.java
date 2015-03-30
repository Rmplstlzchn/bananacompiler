package com.bananaforscale;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

        BananaVisitor visitor = new BananaVisitor();
        String text = createJasminFile((visitor.visit(tree)), visitor.getErrorMessage());
        return writeJasminFile(text);
    }

    private static String createJasminFile(String instructions, String errorMessage) {
        String output;
        if(!errorMessage.equals("")){output = "LDC \""+errorMessage+"\"\ninvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";}
        else{output = instructions + "\n" + "invokevirtual java/io/PrintStream/println(I)V\n";}

        return ".class public Test\n" +
                ".super java/lang/Object\n" +
                ".method public static main([Ljava/lang/String;)V\n" +
                ".limit stack 100\n" +
                ".limit locals 100\n" +
                "getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                output +
                "return\n" +
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
                return "writing jasmin file failed";
            }
        }
        return "successful";
    }
}
