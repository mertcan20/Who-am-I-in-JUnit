package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerTest {
    public static void main(String[] args) {

        // WebDriverManager is used to instantiate the drivers
        WebDriverManager.chromedriver().setup();

        // Create chromedriver
        WebDriver driver = new ChromeDriver();

        // Now that we have our driver ready to use,we can start automation
        driver.get("https://www.artemisspa.com.tr");



    }
}
