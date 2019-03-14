package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {   //    c:/temp/3.txt
        try {
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
            String f1 = bu.readLine();
            String f2 = bu.readLine();
            FileInputStream fin  = new FileInputStream(f1);
            FileOutputStream fo  = new FileOutputStream(f2);
            byte[] b = new byte[fin.available()];
            fin.read(b);
            for (int i = b.length - 1; i >= 0; i--) {
               fo.write(b[i]);
            }
            bu.close();
            fin.close();
            fo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
