package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




public class Checkbox extends TestBase {

    @Test
    public void checkboxTest(){

        // go to given site
        driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");

        //locate the elements of checkboxes
        WebElement checkbox1 = driver.findElement(By.id("box1"));
        WebElement checkbox2 = driver.findElement(By.id("box2"));

        //click on checkbox1 if box is not selected
        if(!checkbox1.isSelected()){
            checkbox1.click();
        }
        //click on checkbox2 if box is not selected
        if(!checkbox2.isSelected()){
            checkbox2.click();
        }
        //verify if pass
        Assertions.assertTrue(checkbox1.isSelected());
        Assertions.assertTrue(checkbox2.isSelected());
    }

}
