package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalCheckTest {
    PalCheck palCheck;
    @Before
    public void setUp(){
        palCheck =new PalCheck();
    }
    @After
    public void tearDown(){
        palCheck=null;
    }
    @Test
    public  void givenPalStringShouldReturnTrue(){
        boolean result= palCheck.isPalindrome("madam");
        assertEquals(true,result);

    }
    @Test
    public  void givenNonPalStringShouldReturnFalse(){
        boolean result= palCheck.isPalindrome("shoot");
        assertNotEquals(true,result);

    }

    @Test (expected = NullPointerException.class)
    public  void givenNullShouldReturnNUll(){

        boolean result= palCheck.isPalindrome(null);

    }

    @Test
    public  void givenNumPalShouldReturnTrue(){
        boolean result= palCheck.isPalindrome("55655");
        assertEquals(true,result);

    }
}