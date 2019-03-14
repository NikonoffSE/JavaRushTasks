package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
            String f = bu.readLine();
            FileInputStream fis = new FileInputStream(f);
            int max=fis.read();
            int cur;
            while (fis.available()>0) {
                if ((cur=fis.read())>max)
                    max = cur;
            }
            System.out.println(max);
            fis.close();
            bu.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
