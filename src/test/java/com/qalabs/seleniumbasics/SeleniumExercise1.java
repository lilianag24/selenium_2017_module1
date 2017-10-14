package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class SeleniumExercise1 {
    public static void main(String[] args) throws InterruptedException{
        //Define la ubicación del driver de Firefox
        File firefoxFilePath = new File("src/test/resources/lib-thirdparty/driversforwin/geckodriver.exe");

        //Indica donde buscar el driver de firefox
        System.setProperty("webdriver.gecko.driver",firefoxFilePath.getPath());

        //Crea una nueva instancia para el driver de Firefox
        WebDriver myDriver = new FirefoxDriver();

        //Abre google
        myDriver.get("https://www.google.com.mx");

        //Tiempo de espera
        Thread.sleep(1000);

        //Cierra la ventana actual
        myDriver.close();
    }
}
