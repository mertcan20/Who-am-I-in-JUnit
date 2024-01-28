package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Alerts extends TestBase {

    @Test
    public void acceptAlert(){

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        //click on first alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        //verify the text "I am a JS Alert",
        String alertText = driver.switchTo().alert().getText();
        Assertions.assertTrue(alertText.equals("I am a JS Alert"));

        //Click OK
        driver.switchTo().alert().accept();

        //and verify "You successfully clicked an alert"
        Assertions.assertTrue(driver.findElement(By.id("result")).getText().equals("You successfully clicked an alert"));

    }@Test
    public void dismissAlert(){

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        //dissmissAlert()=> click on second alert
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        //verify text "I am a JS Confirm"
        String alertText2 = driver.switchTo().alert().getText();
        Assertions.assertTrue(alertText2.equals("I am a JS Confirm"));
        //click cancel
        driver.switchTo().alert().dismiss();

        //and verify "You clicked:cancel"
        Assertions.assertTrue(driver.findElement(By.id("result")).getText().equals("You clicked: Cancel"));

    }@Test
    public void sendkeysAlert(){

        //go to website
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        //sendKeysAlert()=>click on third alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        //verify text "I am a JS prompt"
        String alertText3 = driver.switchTo().alert().getText();
        Assertions.assertTrue(alertText3.equals("I am a JS prompt"));

        //type "Hello World"
        driver.switchTo().alert().sendKeys("Hello World");

        //click OK
        driver.switchTo().alert().accept();

        //and verify "You entered: Hello World"
        Assertions.assertTrue(driver.findElement(By.id("result")).getText().equals("You entered: Hello World"));

    }
}
