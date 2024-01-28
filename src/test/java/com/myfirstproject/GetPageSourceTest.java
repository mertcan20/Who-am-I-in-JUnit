package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceTest {
    public static void main(String[] args) {

        // instantiating driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // enlarging the screen
        driver.manage().window().maximize();

        // navigating the site
        driver.get("https://www.amazon.com.tr/");

        // taking page source
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        if(pageSource.contains("Registry")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL Registry is not existing on the page...");
        }
        driver.quit();

    }
}
