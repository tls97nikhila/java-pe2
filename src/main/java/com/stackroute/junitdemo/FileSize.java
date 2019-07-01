package com.stackroute.junitdemo;

import java.io.BufferedReader; //to read our data
import java.io.FileReader;      //to read file
import  java.io.IOException;    //handle exceptions thrown by buffer reader


public class FileSize {
    public static void displayFile() {
        try{
        int count=0;
        BufferedReader readData=new BufferedReader(new FileReader("/home/talla/Documents/pe2/src/main/file.txt"));
        String line;
        while ((line=readData.readLine())!=null){
            System.out.println(line.toUpperCase());
            count++;
        }
        System.out.println("size of file is "+count+" line/lines");
    }
        catch (IOException io){
            System.out.println("Error reading file");
        }

    }
}
