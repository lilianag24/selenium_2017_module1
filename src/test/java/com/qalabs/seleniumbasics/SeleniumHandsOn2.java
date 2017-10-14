package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "Chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com/");

        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        String myUrl = myDriver.getCurrentUrl();
        assert myUrl.equals("https://www.google.com/"): "La URL no es correcta";

        //find bar element
        WebElement textBox = myDriver.findElement(By.id("lst-ib"));

        //Write Selenium on TextBox
        Actions builder = new Actions(myDriver);
        Actions seriesOfAction = builder.moveToElement(textBox).click().sendKeys(textBox, "Selenium", Keys.ENTER);
        seriesOfAction.perform();
        //textBox.sendKeys("Selenium", Keys.ENTER);

        // Wait some seconds
        Thread.sleep(5000);

        // Quit web driver
        myDriver.quit();
    }
}
