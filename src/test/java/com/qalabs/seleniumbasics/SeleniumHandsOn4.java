package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn4 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "Chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get amazon home page
        myDriver.get("https://www.amazon.com.mx/");

        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //Find search textbox
        WebElement tabSearch = myDriver.findElement(By.id("twotabsearchtextbox"));
        tabSearch.sendKeys("Selenium", Keys.ENTER);

        // Wait some seconds
        Thread.sleep(10000);

        // Quit web driver
        myDriver.quit();
    }
}
