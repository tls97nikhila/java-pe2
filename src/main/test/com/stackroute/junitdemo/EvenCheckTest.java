package com.stackroute.junitdemo;

import com.stackroute.junitdemo.EvenCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenCheckTest {
    EvenCheck evenCheck;
    @Before
    public void setUp(){
        evenCheck= new EvenCheck();
    }
    @After
    public void tearDown(){
        evenCheck=null;
    }

    @Test
    public void givenEvenNmShouldReturnTrue(){
       boolean res= evenCheck.isEven(122232);
       assertTrue(res);
    }

    @Test
    public void givenOddNmShouldReturnFalse(){
        boolean res= evenCheck.isEven(91223);
        assertFalse(res);
    }
    @Test (expected = NullPointerException.class)
    public void giveNullReturnException(){
        boolean res= evenCheck.isEven(null);

    }
    @Test
    public void givenNegEvenNmShouldReturnTrue(){
        boolean res= evenCheck.isEven(-22);
        assertTrue(res);
    }

}