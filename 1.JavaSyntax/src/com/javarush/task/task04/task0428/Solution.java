package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bu.readLine());
        int b = Integer.parseInt(bu.readLine());
        int c = Integer.parseInt(bu.readLine());
        int n =0;
        if (a>0) ++n;
        if (b>0) ++n;
        if (c>0) ++n;
        System.out.println(n);
        //напишите тут ваш код

    }
}

