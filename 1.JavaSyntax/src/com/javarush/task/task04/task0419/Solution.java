package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bu.readLine());
        int b = Integer.parseInt(bu.readLine());
        int c = Integer.parseInt(bu.readLine());
        int d = Integer.parseInt(bu.readLine());
        if(max(a, b) > max(c, d))
            System.out.println(max(a, b));
        else {
            if (max(a, b) < max(c, d))
                System.out.println(max(c, d));
            else
                System.out.println(max(c, d));
        }
        //напишите тут ваш код

    }

    public static int max(int a, int b ) {
        if (a > b)
            return a;
        else
            return b;

    }
}
