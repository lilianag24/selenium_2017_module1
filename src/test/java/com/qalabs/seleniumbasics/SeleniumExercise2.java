package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class SeleniumExercise2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com.mx");

        // Wait some seconds
        Thread.sleep(5000);

        //Print title
        System.out.println(myDriver.getTitle());

        //Print URL
        System.out.println(myDriver.getCurrentUrl());

        //Print source
        System.out.println(myDriver.getPageSource());

        // Quit web driver
        myDriver.quit();
    }
}
