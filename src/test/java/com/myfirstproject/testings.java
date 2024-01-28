        package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;


        public class testings extends TestBase {

    @Test
    public void facebooktest() throws InterruptedException {
        driver.get("https://www.facebook.com/ ");
        Thread.sleep(Duration.ofSeconds(3));

        //Click on Create new account
        driver.findElement(By.xpath("//a[.='Create new account']")).click();
        Thread.sleep(Duration.ofSeconds(3));


        //Enter first name
        driver.findElement(By.name("firstname")).sendKeys("Mertcan");
        Thread.sleep(Duration.ofSeconds(3));


        //Enter last name
        driver.findElement(By.name("lastname")).sendKeys("Mehmetoğlu");
        Thread.sleep(Duration.ofSeconds(3));

        driver.findElement(By.name("reg_email__")).sendKeys("mb20@hotmail.com");
        Thread.sleep(Duration.ofSeconds(3));


        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mb20@hotmail.com");
        Thread.sleep(Duration.ofSeconds(3));



        driver.findElement(By.name("reg_passwd__")).sendKeys("1234mertcan");
        Thread.sleep(Duration.ofSeconds(3));

        dropdownSelectByIndex(driver.findElement(By.id("day")),5);
        Thread.sleep(Duration.ofSeconds(3));


        dropdownSelectByIndex(driver.findElement(By.id("year")),20);
        Thread.sleep(Duration.ofSeconds(3));

        //Enter gender
        WebElement male = driver.findElement(By.cssSelector("input[value='2']"));
        if (!male.isSelected()){
            male.click();
        }
        Thread.sleep(Duration.ofSeconds(3));


        Thread.sleep(Duration.ofSeconds(3));

        //Click Sign Up
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(Duration.ofSeconds(3));

    }



   @Test
    public void registeruser(){
        driver.get("http://automationexercise.com");
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
        Assertions.assertTrue(driver.getCurrentUrl().contains("exercise"));
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[.=' Signup / Login']")).click();
        //5. Verify 'New User Signup!' is visible
        Assertions.assertTrue(driver.getCurrentUrl().contains("login"));
        //6. Enter name
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("martinez");
        //enter email address
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("martinez20@hotmail.com");
        //7. Click 'Signup' button
        driver.findElement(By.xpath("//button[.='Signup']")).click();
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assertions.assertTrue(driver.getCurrentUrl().contains("signup"));
        WebElement mr = driver.findElement(By.id("//input[@id='id_gender1']"));
        if (!mr.isSelected()){
            mr.click();
        }
        driver.findElement(By.id("//input[@id='password']")).sendKeys("martinez2000");
        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.id("//input[@id='name']")).sendKeys("martinez");
        driver.findElement(By.id("//input[@id='email']")).sendKeys("martinez20@hotmail.com");
        driver.findElement(By.id("//input[@id='password']")).sendKeys("martinez2000");
        //fill the date of birth
        dropdownSelectByIndex(driver.findElement(By.id("day")),5);
        dropdownSelectByIndex(driver.findElement(By.id("month")),3);
        dropdownSelectByIndex(driver.findElement(By.id("year")),20);
        //10. Select checkbox 'Sign up for our newsletter!'
        WebElement Signupforournewsletter = driver.findElement(By.id("//input[@id='newsletter']"));
        if (!Signupforournewsletter.isSelected()){
            Signupforournewsletter.click();
        }
        //11. Select checkbox 'Receive special offers from our partners!'
        WebElement Receivespecialoffersfromourpartners = driver.findElement(By.name("//input[@name='optin']"));
        if (!Signupforournewsletter.isSelected()){
            Signupforournewsletter.click();
            //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
            driver.findElement(By.id("//input[@id='first_name']")).sendKeys("martinez");
            driver.findElement(By.id("//input[@id='last_name']")).sendKeys("sokrates");
            driver.findElement(By.id("//input[@id='company']")).sendKeys("Software");
            driver.findElement(By.id("//input[@id='address1']")).sendKeys("5331 Rexford Court, Montgomery AL 36116,");
            driver.findElement(By.id("//input[@name='address2']")).sendKeys("5331 Rexford Court, Montgomery AL 36116");
            dropdownSelectByIndex(driver.findElement(By.name("//select[@name='country']")),1);
            driver.findElement(By.id("//input[@id='state']")).sendKeys("Montgomery");
            driver.findElement(By.id("//input[@id='city']")).sendKeys("US");
            driver.findElement(By.id("//input[@id='zipcode']")).sendKeys("40202 ");
            driver.findElement(By.id("//input[@id='mobile_number']")).sendKeys("555-222-2144");
            //13. Click 'Create Account button'
            driver.findElement(By.tagName("//button[.='Create Account']")).click();
            //14. Verify that 'ACCOUNT CREATED!' is visible
            Assertions.assertTrue(driver.getCurrentUrl().contains("account_created"));
            //15. Click 'Continue' button
            driver.findElement(By.xpath("//a[.='Continue']")).click();
            //16. Verify that 'Logged in as username' is visible
            Assertions.assertTrue(driver.getCurrentUrl().contains("exercise"));
            //17. Click 'Delete Account' button
            driver.findElement(By.xpath("//a[.=' Delete Account']")).click();
            //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
            Assertions.assertTrue(driver.getCurrentUrl().contains("delete_account"));
            driver.findElement(By.xpath("//a[.='Continue']")).click();
        }
    }
}

