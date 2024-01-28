package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AutoSuggestion extends TestBase {
    @Test
    public void autosuggestion() throws InterruptedException {

        //navigate to given site
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
        driver.findElement(By.id("myCountry")).sendKeys("uni");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[.='United Kingdom']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='button']")).click();
        Thread.sleep(1000);
        Assertions.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));






    }
}
