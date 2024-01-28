package com.myfirstproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Locators {



    WebDriver driver;
    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));  // Selenium wait… dynamic.. because driver will wait only if it’s needed
        // Thread.sleep(5000); // Hard wait.. Java wait… It will make the driver wait for 5 seconds even if it is not needed
    }
    @Test
    public void locators() throws InterruptedException {
        // user goes to given site
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // And enter username
        driver.findElement(By.name("username")).sendKeys("Admin");
        // WebElement usernameElement = driver.findElement(By.name("username"));
        // usernameElement.sendKeys("Admin");

        // And enter password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // And click on submit button
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);

        // Then verify the login is successful
        Assertions.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        // OR
        Assertions.assertFalse(driver.getCurrentUrl().contains("auth"));
        Thread.sleep(2000);  // hard wait
        // Then logout the application
        driver.findElement(By.linkText("Logout")).click();   // linkText() works with exact match of the text
        // driver.findElement(By.partialLinkText("Log")).click(); // partialLinkText() works with a part of the text as well
        Thread.sleep(2000);// hard wait
        // Then verify the logout is successful
        Assertions.assertTrue(driver.getCurrentUrl().contains("auth"));
    }
    @AfterEach
    public void teardown(){
        driver.quit();
    }
}
