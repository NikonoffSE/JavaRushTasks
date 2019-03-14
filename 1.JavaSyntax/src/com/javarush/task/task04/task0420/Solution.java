package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(bu.readLine());
       int b = Integer.parseInt(bu.readLine());
       int c = Integer.parseInt(bu.readLine());
       int d;
       if (a < b) {
           d=b;
           b=a;
           a=d;
       }
        if (b < c) {
            d=c;
            c=b;
            b=d;
        }
        if (a < b) {
            d=b;
            b=a;
            a=d;
        }
        System.out.println(a + " " + b + " " + c);

        //напишите тут ваш код
    }
}
