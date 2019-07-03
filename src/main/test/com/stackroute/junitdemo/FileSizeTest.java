package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileSizeTest {
    FileSize fileSize;
    @Before
    public void setUp(){fileSize=new FileSize();
    }

    @After
    public void tearDown() {
        fileSize = null;
    }

    @Test
    public void shouldReturnFileSize(){

        fileSize.displayFile();
    }


}