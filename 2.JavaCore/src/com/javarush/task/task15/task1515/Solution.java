package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;

    static{
        try{
           BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
           A = Integer.parseInt(bu.readLine());
           B = Integer.parseInt(bu.readLine());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static final int MIN = min(A, B);


    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}