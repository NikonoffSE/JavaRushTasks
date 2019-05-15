package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int a=0;
        int b=0;
        try {
            a = Integer.parseInt(bu.readLine());
            b = Integer.parseInt(bu.readLine());
        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
            throw new NumberFormatException();
        }
        if (a <= 0 || b <= 0) throw new Exception();

        int i = (a>b ? b: a);
        int k = 0;
        for (int j = 1; j <= i; j++) {
            if (a % j == 0 && b % j == 0)
                k = j;
        }
        if (k !=0) System.out.println(k);

    }
}
