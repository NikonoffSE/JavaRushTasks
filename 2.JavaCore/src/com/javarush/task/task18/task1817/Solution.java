package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    try {
        //File f = new File("c:/temp/psver.txt");
        FileInputStream fis = new FileInputStream(args[0]);
        int p = 0;
        int c = 0;
        String t;
        while   (fis.available()>0) {
            if(fis.read() == 32)  p++;
            c++;
        }
    //    double d;
  //      d = Math.round((((double)p)/(double)c)*100)/100d;

       // System.out.println((double)p);
        //System.out.println(c);
        double b =  (double)p/(double)c*100d;
//        float k =  (float)p/(float)c;
        //System.out.println(b);
        System.out.printf(String.format("%.2f", b).replace(',', '.'));
        //System.out.println(Math.round(b*100)/100d);
        //System.out.println(d);
        fis.close();
    }
    catch (IOException e) {
        e.printStackTrace();
    }
    }
}
