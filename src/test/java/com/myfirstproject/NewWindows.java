package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;

public class NewWindows extends TestBase {
    @Test
    public void newTabTest() throws InterruptedException {


        driver.get("https://www.linkedin.com/");
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));
        String LinkedinHandle = driver.getWindowHandle();
        //ebay
        //i would like to open ebay page in a new TAB
        driver.switchTo().newWindow(WindowType.TAB);//creates a new tab and switch to new tab

        //driver is on the new tab at this point
        driver.get("https://www.ebay.com/");
        Assertions.assertTrue(driver.getTitle().contains("eBay"));
        String ebayHandle = driver.getWindowHandle();

        //Switch back to linkedin page
        driver.switchTo().window(LinkedinHandle);
        System.out.println("LINKEDIN URL"+driver.getCurrentUrl());
        Thread.sleep(3000);

        //Switch back to ebay page
        driver.switchTo().window(ebayHandle);
        System.out.println("EBAY URL"+driver.getCurrentUrl());

    }@Test
    public void newWindowTest() throws InterruptedException {
        driver.get("https://www.linkedin.com/");
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));
        String LinkedinHandle = driver.getWindowHandle();

        //ebay
        //i would like to open ebay page in a new TAB
        driver.switchTo().newWindow(WindowType.WINDOW);//creates a new tab and switch to new tab

        //driver is on the new tab at this point
        driver.get("https://www.ebay.com/");
        Assertions.assertTrue(driver.getTitle().contains("eBay"));
        String ebayHandle = driver.getWindowHandle();

        //Switch back to linkedin page
        driver.switchTo().window(LinkedinHandle);
        System.out.println("LINKEDIN URL"+driver.getCurrentUrl());
        Thread.sleep(3000);

        //Switch back to ebay page
        driver.switchTo().window(ebayHandle);
        System.out.println("EBAY URL"+driver.getCurrentUrl());


    }
}
