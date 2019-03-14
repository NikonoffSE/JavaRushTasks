package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bu.readLine());
        int b = Integer.parseInt(bu.readLine());
        int c = Integer.parseInt(bu.readLine());
        int n =0;
        int m =0;
        if (a>0) ++n;
        if (b>0) ++n;
        if (c>0) ++n;
        if (a<0) ++m;
        if (b<0) ++m;
        if (c<0) ++m;
        System.out.println("количество положительных чисел: " + n);
        System.out.println("количество отрицательных чисел: " + m);

        //напишите тут ваш код

    }
}
