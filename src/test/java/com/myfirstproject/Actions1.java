package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Actions1 extends TestBase {
    @Test
    public void actions1Test() throws InterruptedException {

        //go to the https://www.amazon.com
        driver.get("https://www.amazon.com");

        //click on account link(locating element that i want to hover over)
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));

        //hover over accountList
        //create actions object
        Actions actions = new Actions(driver);
        actions.moveToElement(accountList).perform();
        WebElement accountLink = driver.findElement(By.linkText("Account"));

        //accountLink.click();//no need actions.this is more common
        //but alternatively i can use actions to click
        actions.click(accountLink).perform();

        //verify that ur title contains "Your Account"
        Assertions.assertTrue(driver.getTitle().contains("Your Account"));

        //scroll to amazon music element at the bottom of the page and click it
        WebElement amazonmusic = driver.findElement(By.xpath("//a[text()='Amazon Music']"));

        //scroll to amazon music element at the bottom of the page and click it
        actions.moveToElement(amazonmusic).perform();
        Thread.sleep(1000);
        actions.click(amazonmusic).perform();
        Thread.sleep(3000);

        //verify that amazon music page is displayed
        Assertions.assertTrue(driver.getCurrentUrl().contains("music"));

        //amazonmusic.click();(ALTERNATIVELY)
        //scroll page up and down
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP);
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_UP);
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();


    }
}



