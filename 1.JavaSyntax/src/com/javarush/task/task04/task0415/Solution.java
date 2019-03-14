package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bu.readLine());
        int b = Integer.parseInt(bu.readLine());
        int c = Integer.parseInt(bu.readLine());
        if (((a + b) > c )&((a + c) > b )&((c + b) > a))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
        //напишите тут ваш код
    }
}