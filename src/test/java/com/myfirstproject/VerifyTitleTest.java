package com.myfirstproject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {
    public static void main(String[] args) {

        //initializing driver
        WebDriver driver = new ChromeDriver();

        //enlarging screen
        driver.manage().window().maximize();

        //navigating to site
        driver.get("https://www.amazon.com");

        //get tittle
        String actualTitle = driver.getTitle();
        System.out.println("PAGE TITLE"+actualTitle);
        if(actualTitle.contains("Amazon")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
            System.out.println("ACTUAL TITLE : "+actualTitle+"doesn't contain expected title : Amazon");
        }
        driver.quit();



    }
}
