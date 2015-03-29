package com.bananaforscale;

import jasmin.ClassFile;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Hello world
 */
public class AppTest
{
    private Path tempDir;
    @BeforeMethod
    public void createTempDir() throws IOException {
        tempDir = Files.createTempDirectory("compilerTest");
    }
    @AfterMethod
    public void deleteTempDir() {
        deleteRecursive(tempDir.toFile());
    }

    private void deleteRecursive(File file) {
        if (file.isDirectory())
            for (File child : file.listFiles())
                deleteRecursive(child);
        if (file.delete())
            throw new Error("Could not delete file <" + file + ">");
    }

    @Test(dataProvider = "provide_code_expectedText")
    public void runningCode_outputsExpectedText(String code, String expectedText) throws Exception {
        String actualOutput = compileAndRun(code);

        Assert.assertEquals(actualOutput, expectedText);
    }
    @DataProvider
    public Object[][] provide_code_expectedText() {
        return new Object[][] {
                {"§ 1+2", "3" + System.lineSeparator()},
                {"§ 1+x", "4" + System.lineSeparator()},            //x=2
                {"§ 1+y", "Error" + System.lineSeparator()},        //y not defined
                {"§ 1+2+42", "Error" + System.lineSeparator()},      //only two operands allowed
                {"§ 2-1", "1" + System.lineSeparator()},
                {"§ 5-x", "3" + System.lineSeparator()},            //x=2
                {"§ x-5", "3" + System.lineSeparator()},            //x=2
                {"§ 5-y", "Error" + System.lineSeparator()},        //y not defined
                {"§ y-5", "Error" + System.lineSeparator()},        //y not defined
                {"§ 42-2-1", "Error" + System.lineSeparator()},      //only two operands allowed
                {"§ 1*2", "2" + System.lineSeparator()},
                {"§ 1*x", "2" + System.lineSeparator()},            //x=2
                {"§ x*1", "2" + System.lineSeparator()},            //x=2
                {"§ 1*y", "Error" + System.lineSeparator()},        //y not defined
                {"§ y*1", "Error" + System.lineSeparator()},        //y not defined
                {"§ 1*2*42", "Error" + System.lineSeparator()},     //only two operands allowed
                {"§ 2/1", "2" + System.lineSeparator()},
                {"§ 2/0", "Error" + System.lineSeparator()},        //division by zero is not allowed
                {"§ 4/x", "2" + System.lineSeparator()},            //x=2
                {"§ x/4", "2" + System.lineSeparator()},            //x=2
                {"§ 4/y", "Error" + System.lineSeparator()},        //y not defined
                {"§ y/4", "Error" + System.lineSeparator()},        //y not defined
                {"§ 42/2/1", "Error" + System.lineSeparator()},      //only two operands allowed
        };
    }

    private String compileAndRun(String code) throws Exception {
        code = App.compile(new ANTLRInputStream(code));
        ClassFile classFile = new ClassFile();
        classFile.readJasmin(new StringReader(code), "", false);
        Path outputPath = tempDir.resolve(classFile.getClassName() + ".class");
        classFile.write(Files.newOutputStream(outputPath));
        return runJavaClass(tempDir, classFile.getClassName());
    }

    private String runJavaClass(Path dir, String className) throws Exception {
        Process process = Runtime.getRuntime().exec(new String[]{"java", "-cp", dir.toString(), className});
        InputStream in = process.getInputStream();
        return new Scanner(in).useDelimiter("\\A").next();
    }
}
