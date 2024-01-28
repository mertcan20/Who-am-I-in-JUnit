package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownload extends TestBase {
    @Test
    public void filedownloadtest(){


        //navigate to site : https://the-internet.herokuapp.com/download
        driver.get("https://the-internet.herokuapp.com/download");

        //download Rectangle.png file
        driver.findElement(By.linkText("Rectangle.png")).click();

        //download completion takes some time so use hard wait
        waitFor(3);

        //verify if the file downloaded successfully
        String pathofdownloadedFile = System.getProperty("user.home")+"/Downloads/Rectangle.png";

        //if pass no message will be displayed if fails message will be displayed
        Assertions.assertTrue(Files.exists(Paths.get(pathofdownloadedFile)),"Download Fails : "+pathofdownloadedFile+"doesn't exist");
    }
}
