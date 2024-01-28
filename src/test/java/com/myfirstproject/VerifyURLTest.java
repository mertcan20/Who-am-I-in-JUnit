package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {
    public static void main(String[] args) {


        //initializing driver
        WebDriver driver = new ChromeDriver();

        //enlarging screen
        driver.manage().window().maximize();

        //navigate to site
        driver.get("https://www.amazon.com");


        //Verify if amazon homepage url is "https://www.amazon.com"
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL"+currentURL);
        if(currentURL.equals(("https://www.amazon.com"))){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL : Actual URL "+currentURL+"but expected URL is https://www.amazon.com");
        }
        driver.quit();
    }
}
