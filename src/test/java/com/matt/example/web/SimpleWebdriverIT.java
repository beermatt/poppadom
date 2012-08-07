package com.matt.example.web;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.*;

public class SimpleWebdriverIT {
    // The webdriver
    private static WebDriver driver;
    @BeforeClass
    public static void initWebDriver() {
        System.out.println("setting up driver");
        driver = new HtmlUnitDriver();
        // Start from the homepage
        driver.get("http://localhost:8080/jetty/example");
    }
    @AfterClass
    public static void stopSeleniumClent() {
        System.out.println("closing driver");
        try {
            driver.close();
            driver.quit();
        } catch( Throwable t ) {
            // Catch error & log, not critical for tests
            System.err.println("Error stopping driver: "+t.getMessage());
            t.printStackTrace(System.err);
        }
    }
    @Test
    public void testHelloBob() {
        WebElement el = driver.findElement(By.xpath("//h2"));
        assertEquals(el.getText(), "Hello Bob!");
    }
    @Test
    public void another() {
        WebElement el = driver.findElement(By.xpath("//h2"));
        assertNotSame(el.getText(), "Piss off Bob!");
    }
}
