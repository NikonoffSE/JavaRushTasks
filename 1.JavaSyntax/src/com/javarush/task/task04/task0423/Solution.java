package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String name = bu.readLine();
        String age  = bu.readLine();
        if (Integer.parseInt(age)>20)
            System.out.println("И 18-ти достаточно");
        //напишите тут ваш код
    }
}
