package com.bananaforscale;

import jasmin.ClassFile;
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
public class App
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

    @Test(dataProvider = "provide_code_exppectedText")
    public void runningCode_outputsExptectedText(String code, String expectedText) throws Exception {
        String actualOutput = compileAndRun(code);

        Assert.assertEquals(actualOutput, expectedText);
    }
    @DataProvider
    public Object[][] provide_code_expectedText() {
        return new Object[][] {
                {"1+2", "3" + System.lineSeparator()},
                {"1+2+42", "45" + System.lineSeparator()}
        };
    }

    private String compileAndRun(String code) throws Exception {
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
