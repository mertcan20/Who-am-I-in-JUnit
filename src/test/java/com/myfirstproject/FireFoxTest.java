package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FireFoxTest {
    public static void main(String[] args) throws InterruptedException {

        // instantiate the driver
        WebDriverManager.firefoxdriver();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.amazon.com/");
        // it is for enlarge the screen
        driver.manage().window().maximize();

        //wait 5 millisecond
        Thread.sleep(5000);
        driver.quit();
    }
}
