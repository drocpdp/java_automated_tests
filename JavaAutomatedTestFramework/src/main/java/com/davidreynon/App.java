package com.davidreynon;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "/Users/davideynon/Projects/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.davidreynon.com");
        driver.quit();
    }
}
