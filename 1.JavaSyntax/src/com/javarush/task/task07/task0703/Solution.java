package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] s = new String[10];
        int[] n = new int[10];
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < s.length; i++) {
            s[i] = bu.readLine();
            n[i] = s[i].length();
        }
        for (int j = 0; j < n.length; j++) {
            System.out.println(n[j]);
        }
    }
}
