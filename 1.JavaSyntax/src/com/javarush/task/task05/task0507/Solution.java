package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        double n = 0;
        int count = 0;
        double sum = 0;
        double d = 0;
        while (true)        {
            n = Double.parseDouble(bu.readLine());
            if (n==-1) {
                d = sum/count;
                System.out.println(d);
                break;
            }
            else
                sum += n;
                count++;
            }
    }
}

