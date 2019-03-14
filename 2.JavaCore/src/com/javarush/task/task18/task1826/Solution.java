package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
//        String p0 = "-d";
  //      String p1 = "c:/temp/1.txt";
    //    String p2 = "c:/temp/2.txt";
        String p0 = args[0];
        String p1 = args[1];
        String p2 = args[2];
        try {
            FileInputStream fis = new FileInputStream(p1);
            FileOutputStream fos = new FileOutputStream(p2);
            if (p0.equals("-e")) {
                while (fis.available() > 0)
                    fos.write(fis.read() + 1);
            } else {
                if (p0.equals("-d")) {
                    while (fis.available() > 0)
                        fos.write(fis.read() - 1);
                }
            }
            fis.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
