package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Member_VariableTest {
    Member_Variable member;
    @Before
    public void setUp(){
        member= new Member_Variable();
    }
    @After
    public void tearDown(){
        member=null;
    }
    @Test
    public void givenThreeInputsShouldDisplay(){
    String res=member.member_variable("Harry Potter",30, (float) 2500.3);
    assertEquals("Success",res);
}
}