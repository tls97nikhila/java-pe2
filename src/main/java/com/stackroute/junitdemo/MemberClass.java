package com.stackroute.junitdemo;

import java.util.*;

    //Member class

class Member{
    String Name;
    int Age;
    float Salary;

    Member(String name, int age, float salary){
        Name = name;
        Age = age;
        Salary = salary;
    }
    public void DisplayMemberDetails(){
        System.out.println("Members Name: " + Name);
        System.out.println("Members Age: " + Age);
        System.out.println("Members Salary: " + Salary);
    }
}

class Member_Variable{
    public String member_variable(String name, int age, float salary){
        Member member = new Member(name, age, salary);
        member.DisplayMemberDetails();
        return "Success";

    }
}