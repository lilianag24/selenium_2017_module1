package com.qalabs.seleniumbasics;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn5 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");

        File chromeFilePath = new File("src/test/resources/lib-thirdparty/driversforwin/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver myDriver = new ChromeDriver(options);

        // Get facebook home page
        myDriver.get("https://www.facebook.com/");

        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //Search for email textbox
        WebElement email = myDriver.findElement(By.id("email"));
        email.sendKeys("auto_tester@outlook.es");

        //Search for password textbox
        WebElement pass = myDriver.findElement(By.id("pass"));
        pass.sendKeys("NHY67ujm");

        //Search for login button
        WebElement login = myDriver.findElement(By.id("loginbutton"));
        login.click();

        // Wait 10 seconds
        Thread.sleep(10000);

        //Find textBox name
        WebElement name = myDriver.findElement(By.name("q"));
        name.sendKeys("QA Minds Lab", Keys.ENTER);

        // Wait 10 seconds
        Thread.sleep(5000);

        //Click on QAMinds
        WebElement qaGroup = myDriver.findElement(By.xpath("//div[text()='QA Minds Lab']"));
        qaGroup.click();

        // Wait 10 seconds
        Thread.sleep(10000);

        WebElement writeMessage = myDriver.findElement(By.xpath("//*[@name='xhpc_message_text']"));
        writeMessage.sendKeys("Selenium Test");
        // Wait 10 seconds
        Thread.sleep(10000);

        WebElement button = myDriver.findElement(By.xpath("//button[@data-testid='react-composer-post-button']"));
        button.click();

        // Wait 10 seconds
        Thread.sleep(10000);

        // Quit web driver
        myDriver.quit();

    }
}
