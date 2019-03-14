package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader( new InputStreamReader(System.in));
        double m = Double.parseDouble(b.readLine())%5;
        //System.out.println(m);

        if (3 > m && m >= 0)
            System.out.println("зелёный");
        else {
            if (4 > m && m >= 3)
                System.out.println("жёлтый");
            else
                System.out.println("красный");
        }


    }
}