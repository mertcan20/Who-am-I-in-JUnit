package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CaptureScreenShot extends TestBase {
    @Test
    public void capturescreenshottest(){


        //navigate to given site
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");

        //take a screenshot of entire page
        captureScreenshotEntirePage();
        driver.findElement(By.id("myCountry")).sendKeys("uni");
        waitFor(1);
        captureScreenshotEntirePage();
        driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[.='United Kingdom']")).click();
        waitFor(1);
        captureScreenshotEntirePage();
        driver.findElement(By.xpath("//input[@type='button']")).click();
        waitFor(1);
        Assertions.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));
        captureScreenshotEntirePage();
    }


}
