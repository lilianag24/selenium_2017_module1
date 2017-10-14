package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.net.URL;

public class SeleniumExercise3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "Chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com.mx");
        Thread.sleep(1000);
        System.out.println(myDriver.getCurrentUrl());

        //Move to facebook
        myDriver.navigate().to("https://www.facebook.com/");
        Thread.sleep(1000);
        System.out.println(myDriver.getCurrentUrl());

        //Move to ESPN
        myDriver.navigate().to("http://www.espn.com/");
        Thread.sleep(2000);
        System.out.println(myDriver.getCurrentUrl());

        //Move backward twice
        myDriver.navigate().back();
        myDriver.navigate().back();
        Thread.sleep(1000);
        System.out.println(myDriver.getCurrentUrl());

        //Move foward once
        myDriver.navigate().forward();
        Thread.sleep(1000);
        System.out.println(myDriver.getCurrentUrl());

        //Refresh
        myDriver.navigate().refresh();
        System.out.println(myDriver.getCurrentUrl());

        // Quit web driver
        myDriver.quit();
    }
}
