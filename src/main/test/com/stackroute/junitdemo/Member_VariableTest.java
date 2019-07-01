package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Member_VariableTest {
@Test
    public void givenThreeInputsShouldDisplay(){
    Member_Variable member=new Member_Variable();
    String res=member.member_variable("Harry Potter",30, (float) 2500.3);
    assertEquals("Success",res);
}
}