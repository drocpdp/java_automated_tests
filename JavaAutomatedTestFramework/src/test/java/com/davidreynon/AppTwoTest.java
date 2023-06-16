package com.davidreynon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTwoTest
{

    @Test
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
