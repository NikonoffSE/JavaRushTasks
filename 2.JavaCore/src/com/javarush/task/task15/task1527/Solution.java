package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String s = bu.readLine();
        s = s.substring(s.indexOf("?")+1);
        String[] sm =  s.split("&");
        for (String l: sm) {   //for (int i = 1; i<sm.length-1; i++) {
            if(l.contains("="))
            l = l.substring(0,l.indexOf("="));
            System.out.print(l + " ");
        }
        for (String l: sm) {
            if (l.contains("obj")) {
                String m = l.substring(l.indexOf("=")+1);
                System.out.println("");

                try {
                        alert(Double.parseDouble(m));
                    }
                catch (NumberFormatException e) {
                    alert(m);
                }

            }

        }

            // System.out.println(s);


        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
