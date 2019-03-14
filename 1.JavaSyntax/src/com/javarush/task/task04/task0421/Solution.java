package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String a = bu.readLine();
        String b = bu.readLine();
        if (a.equals(b))
            System.out.println("Имена идентичны");
        else {
            if (a.length() == b.length())
                System.out.println("Длины имен равны");
        }




        //напишите тут ваш код
    }
}
