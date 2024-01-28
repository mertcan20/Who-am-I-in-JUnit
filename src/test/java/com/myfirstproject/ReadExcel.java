package com.myfirstproject;


import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    //workbook>worksheet>row>cell
    @Test
    public void readExcelTest(){

            // Store the path of the file in a string Open the file
            String path = "resources/Capitals.xlsx";
            try {

            // Open the workbook using fileinputstream
            FileInputStream fileInputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fileInputStream);

            // Open the first worksheet
            Sheet sheet1 = workbook.getSheetAt(0);  // index starts at 0

            // Sheet sheet1 = workbook.getSheet("Sheet1"); // can get the sheet with its name
            // Go to first row
            Row row1 = sheet1.getRow(0); // index starts at 0

            // Go to first cell on that first row and print
            Cell cell1Row1 = row1.getCell(0); // index starts at 0
            System.out.println(cell1Row1);

            // Go to second cell on that first row and print
            Cell cell2Row1 =row1.getCell(1);
            System.out.println(cell2Row1);

            // Go to 2nd row first cell and assert if the data equal to USA
            Row row2 = sheet1.getRow(1);
            Cell row2Cell1 = row2.getCell(0);
            System.out.println(row2Cell1);
            Assertions.assertTrue(row2Cell1.toString().equals("USA"));

            // Go to 3rd row 2nd cell-chain the row and cell
            String row3Cell2 = sheet1.getRow(2).getCell(1).toString();
            System.out.println(row3Cell2);

            // Find the number of row
            int numOfRows = sheet1.getLastRowNum()+1;
            System.out.println("numOfRows = " + numOfRows);

            // Find the number of used row
            int numOfRowsUsed = sheet1.getPhysicalNumberOfRows();
            System.out.println("numOfRowsUsed = " + numOfRowsUsed);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}