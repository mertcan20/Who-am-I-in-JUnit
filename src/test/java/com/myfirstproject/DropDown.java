package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

    public class DropDown extends TestBase {

        @Test
        public void dropdownTest(){
            driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        // 2000 February 15(example of date)

        // 1. locate the dropdown element
            WebElement year = driver.findElement(By.id("year"));

        //  2. create a Select Object
            Select selectYear = new Select(year);
        //  3. now that we have select object, we can interact with this dropdown element
            selectYear.selectByVisibleText("2000");//selecting by visible text

        //  MONTHS
            WebElement months = driver.findElement(By.id("month"));
            Select selectMonths = new Select(months);
        // selectMonths.selectByIndex(1);//selecting by index(index starts at 0)

        //  SELECTING THE FIRST MONTHS USING REUSABLE METHOD
            dropdownSelectByIndex(driver.findElement(By.id("month")),1);//WebElement,int

        //  dropdownSelectByIndex(By.xpath("//select[@id='month']"),0);//locator,index
        //  dropdownSelectByIndex(By.id("month"),0);//locator,index
        //  dropdownSelectByIndex("//select[@id='month']",0);//xpath,index
            //these are extra choices



        //  DAY
            WebElement day = driver.findElement(By.id("day"));
            Select selectDay = new Select(day);
            selectDay.selectByValue("15");//selecting by value


        //  Assert if 2000 is selected
            WebElement selectedYear = selectYear.getFirstSelectedOption();//getting the selected options
            System.out.println(selectedYear.getText());//getting the text of the selected year
            Assertions.assertTrue(selectedYear.getText().equals("2000"));//asserting if selected test is as expected

        //  get all the months and assert if April is an option in the month dropdown
            List<WebElement> allMonths = selectMonths.getOptions();
            boolean isAprilExist=false;
            for (WebElement eachMonth : allMonths){
                System.out.println(eachMonth.getText());
                if (eachMonth.getText().equals("April")){
                    isAprilExist=true;
                }
            }
            Assertions.assertTrue(isAprilExist);

        }
    }