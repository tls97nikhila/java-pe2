package com.stackroute.junitdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

        public class WordFrequencyinFile {

            public static void main(String args[]) throws Exception
        {
            HashMap<String, Integer> frequency = new HashMap();
            File newfile = new File("/home/talla/Documents/pe2/src/main/file.txt");
            BufferedReader br = null;
            try{
                br = new BufferedReader(new FileReader(newfile));
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            String st;
            int i;
            while ((st = br.readLine()) != null)
            {
                String[] words = st.split(" ");
                for(i=0;i<words.length;i++)
                {
                    if(frequency.containsKey(words[i]))
                    {
                        int a = frequency.get(words[i]);
                        frequency.put(words[i], a+1);
                    }
                    else
                    {
                        frequency.put(words[i], 1);
                    }
                }
            }
            for (HashMap.Entry<String,Integer> entry : frequency.entrySet())
            {
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            }
        }
    }


