package com.bananaforscale;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Hello world
 */
public class CompilerTest
{
    private Path tempDir;
    @BeforeMethod
    public void createTempDir() throws IOException {
        tempDir = Files.createTempDirectory("compilerTest");
    }
    @AfterMethod
    public void deleteTempDir() {
        delete(tempDir.toFile());
    }
    private void delete(File file) {
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

    @Test(dataProvider = "provide_code_expectedText")
    public void runningCode_outputsExpectedText(String code, String expectedText) throws Exception {
        Assert.assertEquals(Compiler.compile(new ANTLRInputStream(code)), expectedText);
    }
    @DataProvider
    public Object[][] provide_code_expectedText() {
        return new Object[][] {
                {"1+2", "3" + System.lineSeparator()},
                {"1+x", "Error: Accessing undeclared variable" + System.lineSeparator()},            //x=2
                {"1+y", "Error: Accessing undeclared variable" + System.lineSeparator()},        //y not defined
                //{"1+2+42", "Error" + System.lineSeparator()},     //only two operands allowed
                {"2-1", "1" + System.lineSeparator()},
                {"5-x", "Error: Accessing undeclared variable" + System.lineSeparator()},            //x=2
                {"x-5", "Error: Accessing undeclared variable" + System.lineSeparator()},            //x=2
                {"5-y", "Error: Accessing undeclared variable" + System.lineSeparator()},        //y not defined
                {"y-5", "Error: Accessing undeclared variable" + System.lineSeparator()},        //y not defined
                //{"42-2-1", "Error" + System.lineSeparator()},     //only two operands allowed
                {"1*2", "2" + System.lineSeparator()},
                {"1*x", "Error: Accessing undeclared variable" + System.lineSeparator()},            //x=2
                {"x*1", "Error: Accessing undeclared variable" + System.lineSeparator()},            //x=2
                {"1*y", "Error: Accessing undeclared variable" + System.lineSeparator()},        //y not defined
                {"y*1", "Error: Accessing undeclared variable" + System.lineSeparator()},        //y not defined
                //{"1*2*42", "Error" + System.lineSeparator()},     //only two operands allowed
                {"2/1", "2" + System.lineSeparator()},
                {"2/0", "Error: Division by zero" + System.lineSeparator()},        //division by zero is not allowed
                {"4/x", "Error: Accessing undeclared variable" + System.lineSeparator()},            //x=2
                {"x/4", "Error: Accessing undeclared variable" + System.lineSeparator()},            //x=2
                {"4/y", "Error: Accessing undeclared variable" + System.lineSeparator()},        //y not defined
                {"y/4", "Error: Accessing undeclared variable" + System.lineSeparator()},        //y not defined
                //{"42/2/1", "Error" + System.lineSeparator()},     //only two operands allowed
                {"1+2", "3" + System.lineSeparator()},
                //{"1+2+42", "45" + System.lineSeparator()}         //result will be 3 because grammar cannot read more than two operands
        };
    }
}
