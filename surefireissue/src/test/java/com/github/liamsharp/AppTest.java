package com.github.liamsharp;

import java.util.concurrent.TimeUnit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        final long end = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(5);
        
        while (System.currentTimeMillis() < end)
        {
            try
            {
                Thread.sleep(200);
                assertTrue( true );
            }
            catch (InterruptedException e)
            {
                fail(e.toString());
            }
        }
    }
}
