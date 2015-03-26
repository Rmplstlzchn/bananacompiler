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
    public static void main( String[] args ) throws Exception {
        ANTLRInputStream input = new ANTLRFileStream("code/demo.code");
        BananaCompilerLexer lexer = new BananaCompilerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BananaCompilerParser parser = new BananaCompilerParser(tokens);

        ParseTree tree = parser.prog();
    }
}
