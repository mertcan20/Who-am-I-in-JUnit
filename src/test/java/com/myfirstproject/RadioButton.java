package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RadioButton extends TestBase {

    @Test
    public void radioTest(){


        // Go to the url https://testcenter.techproeducation.com/index.php?page=radio-buttons
            driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");
        // Click on Red if not already checked
            WebElement red = driver.findElement(By.cssSelector("#red"));
        if (!red.isSelected()){
            red.click();
        }

        // Click on Football if not already checked
            WebElement football = driver.findElement (By.cssSelector("football"));
            if (!football.isSelected()){
                football.click();
            }
        //        Assertions
            Assertions.assertTrue(red.isSelected());
            Assertions.assertTrue(football.isSelected());

    }
}