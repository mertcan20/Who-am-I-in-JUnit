package com.myfirstproject;

import org.junit.jupiter.api.*;

public class JUnitAnnotations {


    @BeforeAll
    public static void setUpClass(){
        System.out.println("Before All...");
    }
    @AfterAll
    public static void tearDownClass(){
        System.out.println("After All...");
    }
    @BeforeEach
    public void setUpMethods(){
        System.out.println("Before Each....");
    }
    @AfterEach
    public void tearDownMethods(){
        System.out.println("After Each...");
    }
    @Test
    public void test1(){
        System.out.println("Test Case 1...");
    }
    @Test
    public void test2(){
        System.out.println("Test Case 2...");
    }
    @Test
    public void test3(){
        System.out.println("Test Case 3...");
    }
    @Test @Disabled
    public void test4(){
        System.out.println("Test Case 4...");
    }
    @Test
    public void test5(){
        System.out.println("Test Case 5...");
    }
    @Test @Disabled
    public void test6(){
        System.out.println("Test Case 6...");
    }

}

