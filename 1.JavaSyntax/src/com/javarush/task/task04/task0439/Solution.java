package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String  m = bu.readLine();//напишите тут ваш код
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(m + " любит меня.");
        }
    }
}
