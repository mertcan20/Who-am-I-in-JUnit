package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CaptureScreenshot0fElements extends TestBase {

    @Test
    public void captureScreenshot0fElementsTest(){

        //navigate to google
        driver.get("https://www.google.com/");
        capturescreenshotofelement(driver.findElement(By.xpath("//img[@alt='Google']")));
    }
}
