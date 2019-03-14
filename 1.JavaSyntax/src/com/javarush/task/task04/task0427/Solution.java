package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bu.readLine());
        String b = "";
        String c = "";
        if (a%2==0) c = "четное";
        else
            c = "нечетное";
            if (a < 10 && a > 0) b = "однозначное";
            else {
                if (a < 100) b = "двузначное";
                else
                if (a < 1000) b = "трехзначное";
            }
        //напишите тут ваш код
        if (a > 0 && a < 1000)
        System.out.println(c + " " + b + " число");
    }
}
