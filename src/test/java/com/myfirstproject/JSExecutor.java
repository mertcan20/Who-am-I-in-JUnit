package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;




public class JSExecutor extends TestBase {
    @Test
    public void jsExecutorTest1() throws InterruptedException {

        //      Given user is on the https:// www.amazon.com/
                driver.get("https://www.amazon.com/");

        //      When use click on “Account” link
                WebElement accountListTab = driver.findElement(By.id("nav-link-accountList"));

                //Actions actions = new Actions(driver);
                //actions.moveToElement(accountListTab).perform();
                //instead of using two line of code we can use actionsHoverOnElement method
                actionsHoverOnElement(accountListTab);// hover over with reusable methods
                Thread.sleep(1000);
                WebElement accountLink = driver.findElement(By.linkText("Account"));

                JavascriptExecutor js = (JavascriptExecutor) driver;
        //      2. use executescript to execute js code
                js.executeScript("arguments[0].click()",accountLink);//clicking account link using js

                //arguments[0] refers to first element
                Thread.sleep(1000);

        //       Then verify the page title contains “Your Account”
                Assertions.assertTrue(driver.getTitle().contains("Your Account"));

        //       Then scroll to Amazon Music element at the bottom of the page
                WebElement amazonMusic = driver.findElement(By.xpath("//a[text()='Amazon Music']"));
                js.executeScript("arguments[0].scrollIntoView(true);",amazonMusic);
                Thread.sleep(1000);

        //       And click on it        //its optional to use semi column at the end but its using in general
                js.executeScript("arguments[0].click();",amazonMusic);
                Thread.sleep(1000);

        //       Then verify Amazon Music page is displayed
                Assertions.assertTrue(driver.getCurrentUrl().contains("music"));

        //       Scroll the page up and down
                Thread.sleep(1000);
                js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //scroll all the way down
                Thread.sleep(3000);
                js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//Scroll all the way down
                js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");//Scroll all the way up

        //       LOCATE THE SEARCH BOX USING JS EXECUTOR
                WebElement searchbox =  locateElementByJS("navbarSearchInput");

        //       TYPE POP MUSIC
                setValueByJS(searchbox,"POP MUSIC");

        //       GET AND PRINT THE VALUE OF THAT INPUT
                waitFor(2);
                    String input = getValueByJS("navbarSearchInput");
                System.out.println(input);

    }
}
