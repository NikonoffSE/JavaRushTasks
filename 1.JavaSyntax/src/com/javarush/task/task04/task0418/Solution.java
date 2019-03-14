package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bu.readLine());
        int b = Integer.parseInt(bu.readLine());
        if (a>b)
            System.out.println(b);
        else {
            if (b > a)
                System.out.println(a);
            else
                System.out.println(a);
        }
    }
}