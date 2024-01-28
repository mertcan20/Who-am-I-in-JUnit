package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class IFrames extends TestBase {
    @Test
    public void iframes(){

        //given go to "https://testpages.herokuapp.com/styled/frames/frames-test.html"
        driver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html");

        //then assert that "left list item 29 is the last element in the "left"
        //"Left List Item 29" IS INSIDE THE IFRAME SO SWITCH TO THAT FRAME FIRST
        driver.switchTo().frame("left");

        //now we are inside the iframe
        String lastElement = driver.findElement(By.xpath("//li[last()]")).getText();

        System.out.println("LAST ELEMENT : "+lastElement);
        Assertions.assertTrue(lastElement.equals("Left List Item 29"));

        //li[last()] => XPATH RETURNS THE LAST li ELEMENT(İnfo)
        //and assert that "middle list item 39 " is the last element in the middle

        //to go to sibling frames switch to the parent first then switch to child
        driver.switchTo().defaultContent();//switching to the main html page
        driver.switchTo().frame("middle");//switching to the middle frame
        String middlelastItem = driver.findElement(By.xpath("//li[last()]")).getText();//driver is in the middle frame and gettin the middle frame elements
        Assertions.assertTrue(middlelastItem.equals("Middle List Item 39"));




    }
}
