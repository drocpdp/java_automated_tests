package com.davidreynon;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

/**
 * Unit test for simple App.
 */
public class AppTwoTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTwoTest( String testName )
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
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "/Users/davideynon/Projects/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.davidreynon.com");
        driver.quit();             
        assertTrue( true );
    }
}
