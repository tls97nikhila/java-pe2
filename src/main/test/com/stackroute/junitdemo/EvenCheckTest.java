package com.stackroute.junitdemo;

import com.stackroute.junitdemo.EvenCheck;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenCheckTest {

    @Test
    public void givenEvenNmShouldReturnTrue(){
        EvenCheck evenCheck=new EvenCheck();
       boolean res= evenCheck.isEven(122232);
       assertEquals(true,res);
    }

    @Test
    public void givenOddNmShouldReturnFalse(){
        EvenCheck evenCheck=new EvenCheck();
        boolean res= evenCheck.isEven(91223);
        assertEquals(false,res);
    }
}