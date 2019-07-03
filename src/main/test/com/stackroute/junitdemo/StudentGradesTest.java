package com.stackroute.junitdemo;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
    public class StudentGradesTest {
        StudentGrades grades ;
        int [] arr = {66,72,83,64,75};
        @Before
        public void setUp() {
            grades = new StudentGrades();
        }

        @After
        public void tearDown() {
            grades = null;
        }

        @Test
        public void testMaximum()
        {
            int expected =83;
            int actual = grades.maximum(arr,5);
            assertEquals(expected,actual);
        }

        @Test
        public void testMinimum()
        {
            int expected =64;
            int actual = grades.minimum(arr,5);
            assertEquals(expected,actual);
        }

        @Test
        public void testAverage()
        {
            double expected =72;
            double actual = grades.average(arr,5);
            assertEquals(expected,actual,0);
        }

        @Test(expected = ArithmeticException.class)
        public void testArrayLengthZeroReturnException(){
            double actual=grades.average(arr,0);
        }

        @Test
        public void testgivenarrayNotRetuenWrong(){
            double actual=grades.average(arr,5);
            assertNotEquals(71,actual);

        }
    }
