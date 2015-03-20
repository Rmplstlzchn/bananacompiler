package com.bananaforscale;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        final App test = new App();
        test.testTrue();
    }

    @Test
    public void testTrue() {
        Assert.assertEquals(true, true);
    }
}
