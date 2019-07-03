package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPower4Test {
    CheckPower4 checkPower4;
    @Before
    public void setUp(){
        checkPower4= new CheckPower4();
    }
    @After
    public  void tearDown(){
        checkPower4=null;
    }
    @Test
    public void givenNonPowerShouldReturnFalse(){
        boolean res=checkPower4.isPower4(14);
        assertFalse(res);
    }

    @Test
    public void givenPowerShouldReturnTrue(){
        boolean res=checkPower4.isPower4(64);
        assertTrue(res);
    }
    @Test
    public void givenNegativeShouldReturnfalse(){
        boolean res=checkPower4.isPower4(-1);
        assertFalse(res);
    }

    @Test
    public void givenZeroShouldReturnfalse(){
        boolean res=checkPower4.isPower4(0);
        assertFalse(res);
    }

    @Test
    public void givenPowerShouldReturnfalse3(){
        boolean res=checkPower4.isPower4(11);
        assertFalse(res);
    }



}