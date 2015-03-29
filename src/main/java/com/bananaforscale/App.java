package com.bananaforscale;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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
        return createJasminFile((new BananaVisitor().visit(tree)));
    }

    private static String createJasminFile(String instructions) {
        return ".class public Test\n" +
                ".super java/lang/Object\n" +
                ".method public static main([Ljava/lang/String;)V\n" +
                ".limit stack 100\n" +
                ".limit locals 100\n" +
                "getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                instructions + "\n" +
                "invokevirtual java/io/PrintStream/println(I)V\n" +
                "return\n" +
                ".end method";
    }
}
