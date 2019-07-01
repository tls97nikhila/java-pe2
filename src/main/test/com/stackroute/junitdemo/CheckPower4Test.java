package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPower4Test {
    @Test
    public void givenNonPowerShouldReturnFalse(){
        CheckPower4 checkPower4 = new CheckPower4();
        boolean res=checkPower4.isPower4(14);
        assertEquals(false,res);
    }

    @Test
    public void givenPowerShouldReturnTrue(){
        CheckPower4 checkPower4 = new CheckPower4();
        boolean res=checkPower4.isPower4(64);
        assertEquals(true,res);
    }


}