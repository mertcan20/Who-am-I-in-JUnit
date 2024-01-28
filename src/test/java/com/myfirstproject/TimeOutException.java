package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TimeOutException extends TestBase {
        @Test
    public void timeOutTest(){

            //navigate to amazon
            driver.get("https://www.amazon.com");
            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                    .sendKeys("tea pot"+ Keys.ENTER);
            waitForVisibility(By.xpath("//input[@id=' twotabsearchtextbox']"),15)
                    .sendKeys("tea pot"+Keys.ENTER);
        }
}
