package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotClass extends TestBase {
    @Test
    public void fileuploadtest() throws AWTException {

        driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html");
        String pathofFlower = System.getProperty("user.home")+"/Desktop/flower.webp";

        // robot class
        StringSelection ss = new StringSelection(pathofFlower);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
        Robot robot = new Robot();

        // pressing control V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        // release
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        // press enter
        robot.keyPress(KeyEvent.VK_ENTER);

        // release enter
        robot.keyRelease(KeyEvent.VK_ENTER);
        waitFor(3);
        Assertions.assertEquals("flower,webp"
                ,driver.findElement(By.id("id=uploadedfilename")).getText(),
                "File upload is not successfull : Actual file name is not flower.webp");

        //alternatively
        Assertions.assertEquals(
                "You uploaded a file.This is the result.",
                driver.findElement(By.xpath("//div[@class='explanation']")).getText(),
                "Upload is failed!!!");




    }
}
