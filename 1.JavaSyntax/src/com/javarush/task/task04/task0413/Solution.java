package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bu.readLine());
        if (7<n||n<1)
            System.out.println("такого дня недели не существует");
        else {
            if (n == 1)
                System.out.println("понедельник");
            if (n == 2)
                System.out.println("вторник");//напишите тут ваш код
            if (n == 3)
                System.out.println("среда");
            if (n == 4)
                System.out.println("четверг");
            if (n == 5)
                System.out.println("пятница");
            if (n == 6)
                System.out.println("суббота");
            if (n == 7)
                System.out.println("воскресенье");
        }
    }
}