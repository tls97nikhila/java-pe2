package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalCheckTest {
    @Test
    public  void givenPalStringShouldReturnTrue(){
        PalCheck palCheck=new PalCheck();
        boolean result= palCheck.isPalindrome("madam");
        assertEquals(true,result);

    }
    @Test
    public  void givenNonPalStringShouldReturnFalse(){
        PalCheck palCheck=new PalCheck();
        boolean result= palCheck.isPalindrome("Never");
        assertEquals(false,result);

    }
}