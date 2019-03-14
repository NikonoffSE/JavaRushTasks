package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int a  =Integer.parseInt(bu.readLine());
        int b  =Integer.parseInt(bu.readLine());
        int c  =Integer.parseInt(bu.readLine());
        if (a==b)
           System.out.println(3);
        else {
            if (a == c)
                System.out.println(2);
            else
                if (b==c)
                    System.out.println(1);
        }
        //напишите тут ваш код
    }
}
