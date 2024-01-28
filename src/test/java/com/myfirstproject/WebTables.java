package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class WebTables extends TestBase {

    @Test
    public void webTablesTest(){

        //go to navigate site
        driver.get("https://the-internet.herokuapp.com/tables");

        // Task 1 : Print the entire table and Assert if the last element in the table 1 is "edit delete"
        System.out.println("TASK 1 PRINT ENTIRE TABLE : ***ENTIRE TABLE***");
        String entireTableData = driver.findElement(By.xpath("//table[@id='table1']")).getText();
        System.out.println( entireTableData);

        //ALTERNATIVELY
        //if u want to take all of the row one by one we can use this code
        int dataNum = 1;
        List<WebElement> elementslist = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement eachelement : elementslist){
            System.out.println("Data"+dataNum+"=>"+eachelement.getText());
            dataNum++;
        }

        //Assert if the last element in the table 1 is edit delete
        //if we want to take last index we need to apply size - 1 method like we did above
        Assertions.assertTrue(elementslist.get(elementslist.size()-1).getText().equals("edit delete"));

         // Task 2 : Print All Rows
        System.out.println("TASK 2 PRINT ALL ROW : ***ALL ROW***");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        int rowNum = 1;
        for (WebElement eachRow : allRows){
            System.out.println("Row"+rowNum+"=>"+eachRow.getText());
        }

         // Task 3 : Print Last row data only
        System.out.println("TASK 3 PRINT LAST ROW : ****LAST ROW****");
        System.out.println("Last Row : "+allRows.get(allRows.size()-1).getText());

         // Task 4 : Print column 5 data in the table body
        System.out.println("Task 4 : Print column 5 data in the table body");
        List<WebElement> column5 = driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));
        int colNum = 1;
        for (WebElement each : column5){
            System.out.println("ColNum : "+"=>"+each.getText());
            colNum++;
        }

   }
}