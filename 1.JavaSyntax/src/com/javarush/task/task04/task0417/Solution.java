package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
        int a = Integer.parseInt(bu.readLine());
        int b = Integer.parseInt(bu.readLine());
        int c = Integer.parseInt(bu.readLine());
        if (a == b & b == c)
            System.out.println(a + " " + a + " " + a);
        else {
            if (b == c)
                System.out.println(b + " " + b);
            else
                if (a == b || a == c)
                System.out.println(a + " " + a);
        }

    }
}