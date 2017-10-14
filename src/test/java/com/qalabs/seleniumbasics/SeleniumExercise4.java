package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class SeleniumExercise4 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "Chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.youtube.com");

        // Wait some seconds
        Thread.sleep(5000);

        //find bar element
        WebElement myElement = myDriver.findElement(By.id("search-container"));
        //Check if element is displayed and enabled
        assert myElement.isDisplayed(): "No se encontro el Bar elemento";
        assert myElement.isEnabled(): "No esta habilitado el Bar element";
        Actions builder = new Actions(myDriver);
        Actions seriesOfAction = builder.moveToElement(myElement).click().sendKeys(myElement, "Selenium");
        seriesOfAction.perform();
        //myElement.sendKeys("Selenium");
        WebElement myElement2 = myDriver.findElement(By.id("search-icon-legacy"));
        myElement2.click();
        Thread.sleep(5000);

        // Quit web driver
        myDriver.quit();
    }
}
