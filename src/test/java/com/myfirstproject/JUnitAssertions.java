package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitAssertions {

     @Test
     public void assertionsTest(){
         Assertions.assertEquals(5,5);
         Assertions.assertEquals("apple","APPLE".toLowerCase());

         Assertions.assertTrue(5>3);
         Assertions.assertTrue(true);
         System.out.println("LINE 30");
         Assertions.assertTrue("selenium".contains("e"));

         Assertions.assertFalse(3>5);
         Assertions.assertFalse(false);
         Assertions.assertFalse("java".contains("e"));

         char[] expected ={'j','a','v','a'};
         char[] actual = "java".toCharArray();
         Assertions.assertArrayEquals(expected,actual);

         String str = null;
         Assertions.assertNull(str);
         Assertions.assertNotNull("NOT NULL VALUE");
     }

}
