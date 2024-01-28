package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends TestBase {
    @Test
    public void FileUploadTest(){


        //navigate to given site
        driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html");

        //when user selects  an image from the desktop
        //file upload system is created using file type=input element,so we can use sendKeys(PATH) to upload
        WebElement chooseaFile = driver.findElement(By.xpath("//div//input[@name='filename']"));
        String pathofFlower = System.getProperty("user.home")+"/Desktop/flower.webp";
        chooseaFile.sendKeys(pathofFlower);
        waitFor(3);

        //click on the upload button
        WebElement uploadButton = driver.findElement(By.xpath("//input[@type='submit']"));

        //verify that
        Assertions.assertEquals("flower,webp"
                ,driver.findElement(By.id("id=uploadedfilename")).getText(),
                "File upload is not successfull : Actual file name is not flower.webp");

        //alternatively
        Assertions.assertEquals(
                "You uploaded a file.This is the result.",
                driver.findElement(By.xpath("//div[@class='explanation']")).getText(),
                "Upload is failed!!!"
        );
    }

}
