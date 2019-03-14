package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in)); // c:/temp/1.txt
            String f1 = bu.readLine();
            String f2 = bu.readLine();
            FileInputStream fis = new FileInputStream(f1);
            bu.close();
            bu = new BufferedReader(new InputStreamReader(fis));
            String base = bu.readLine();
            FileOutputStream fos = new FileOutputStream(f2);
            BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(fos));
            String[] st = base.split(" ");
            for (String s: st) {
                System.out.println(Math.round(Double.parseDouble(s)) + " ");
                bf.write(( Math.round(Double.parseDouble(s))) + " ");
            }
           // bf.write("что за жопа?");


            bu.close();
        bf.close();
            fos.close();


        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
