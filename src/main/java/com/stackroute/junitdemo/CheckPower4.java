package com.stackroute.junitdemo;

public class CheckPower4 {
    public static boolean isPower4(long input){
            if(input == 0)
                return false;
            while(input != 1)
            {
                if(input % 4 != 0)
                    return false;
               input/= 4;
            }
            return true;

    }
}
