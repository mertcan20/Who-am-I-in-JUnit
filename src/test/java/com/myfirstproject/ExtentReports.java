package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class ExtentReports extends TestBase {

    @Test
    public void ExtentReportsTest(){
        extentTest.pass("Logged is successfull");
        extentTest.fail("Login is failed");
        extentTest.skip("Login is skipped");
        extentTest.warning("Pay attention to login");
        extentTest.info("Login is successfull");


        //Assertions.assertTrue("Amazon title".contains("Amazon"),"Amazon title test failed");
        //in testing we can use extent reports within conditions
        if ("Amazon title".contains("Amazon")){
            extentTest.pass("Amazon title PASSED");
        }else{
            extentTest.fail("Amazon1 title test failed");
        }
    }@Test
    public void ExtentReportsTest2() throws IOException {
        extentTest
                .fail("Navigating to the application home page")//marking test step as pass
                .assignAuthor("John","Sam","Nancy")//optional : adding authors
                .assignCategory("Smoke","Regression","Integration")//optional : adding test categories
                .assignDevice("Mac","Windows")//optional : adding devices
                .addScreenCaptureFromPath(captureScreenshotEntirePageAsString());//optional : adding screenshot at this point
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
        extentTest
                .pass("User is on the home page")
                .addScreenCaptureFromPath(captureScreenshotEntirePageAsString());


        //user type "uni" in the search box
        driver.findElement(By.id("myCountry")).sendKeys("uni");
        waitFor(1);
        extentTest
                .pass("Typed uni in the search box")
                .addScreenCaptureFromPath(captureScreenshotEntirePageAsString());


        //select "United Kingdom" from the suggestions
        driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[.='United Kingdom']")).click();
        waitFor(1);
        extentTest
                .pass("Selected United Kingdom Option")
                .addScreenCaptureFromPath(captureScreenshotEntirePageAsString());

//          click on submit button
        driver.findElement(By.xpath("//input[@type='button']")).click();
        waitFor(1);

        //then verify the result contains "United Kingdom""
        Assertions.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));
        extentTest
                .pass("Result contains United Kingdom")
                .addScreenCaptureFromPath(captureScreenshotEntirePageAsString());


    }
}
