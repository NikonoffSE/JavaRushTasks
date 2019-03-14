package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String name = bu.readLine();
        String age  = bu.readLine();
        if (Integer.parseInt(age)<18)
            System.out.println("Подрасти еще");
    }
}
