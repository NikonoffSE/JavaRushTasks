package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try {
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
            String f = bu.readLine();
            FileInputStream fis = new FileInputStream(f);
            int min = fis.read();
            int cur;
            while (fis.available() > 0) {
                if ((cur = fis.read()) < min)
                    min = cur;
            }
            System.out.println(min);
            fis.close();
            bu.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}