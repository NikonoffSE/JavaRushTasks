package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] n = new int[15];
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int ch = 0;
        int nech = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(bu.readLine());
            if (i==0 || i%2==0) ch = ch + n[i];
            else {
                if (i%2!=0) nech = nech + n[i];
            }
        }
        if (nech>ch)
        System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
