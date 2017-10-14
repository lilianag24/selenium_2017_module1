package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "Chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get facebook home page
        myDriver.get("https://www.facebook.com/");

        myDriver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        //Search for email textbox
        WebElement email = myDriver.findElement(By.id("email"));
        email.sendKeys("auto_tester@outlook.es");

        //Search for password textbox
        WebElement pass = myDriver.findElement(By.id("pass"));
        pass.sendKeys("NHY67ujm");

        //Search for login button
        WebElement login = myDriver.findElement(By.id("loginbutton"));
        login.click();

        // Wait 5 seconds
        myDriver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        // Quit web driver
        myDriver.quit();
    }
}
