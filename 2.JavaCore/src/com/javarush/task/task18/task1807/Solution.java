package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

        try {
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in)); // c:/temp/1.txt
            String fname = bu.readLine();
            FileInputStream inputStream = new FileInputStream(fname);
            int c = 0;
            while (inputStream.available() > 0) {
                if (inputStream.read() == 44)
                c++;
            }
            System.out.println(c);
            bu.close();
            inputStream.close();
        } catch (IOException e) {

        }

    }
}
