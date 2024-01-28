package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        // Create chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open google home page https://www.walmart.com/
        driver.get("https://www.walmart.com/");

        // wait for 5 seconds at this step
        Thread.sleep(5000);

        // On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        // wait 5 seconds
        Thread.sleep(5000);

        // Navigate back to walmart
        driver.navigate().back();

        // wait 5 seconds
        Thread.sleep(5000);

        // Navigate forward to amazon
        driver.navigate().forward();

        // wait 5 seconds
        Thread.sleep(5000);

        // Refresh the page
        driver.navigate().refresh();

        // wait 5 seconds
        Thread.sleep(5000);

        // Close/Quit the browser
        driver.navigate().to("https://www.amazon.com");
        driver.quit();
        // driver.close();
        // it is for closing one tab driver.close(); method
    }
}
