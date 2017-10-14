package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn6 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "Chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get wikipedia home page
        myDriver.get("https://www.wikipedia.org");

        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement searchField = myDriver.findElement(By.id("searchInput"));
        searchField.sendKeys("Selenium", Keys.ENTER);

        // Wait 10 seconds
        Thread.sleep(5000);

        // get the text of the body element
        WebElement body = myDriver.findElement(By.tagName("body"));
        String bodyText = body.getText();

        // count occurrences of the string
        int count = 0;

        // search for the String within the text
        while (bodyText.contains("Selenium")){

            // when match is found, increment the count
            count++;

            // continue searching from where you left off
            bodyText = bodyText.substring(bodyText.indexOf("Selenium") + "Selenium".length());
        }

        System.out.println("Se repite: "+ count);

        // Quit web driver
        myDriver.quit();
        }


    }
