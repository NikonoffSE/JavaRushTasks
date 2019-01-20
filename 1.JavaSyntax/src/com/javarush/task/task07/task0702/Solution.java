package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[10];
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            String s = bu.readLine();
            arr[i] = s;
            //System.out.println(s);
            //System.out.println(arr[i]);
        }
        //arr[8] = null;
        //arr[9] = null;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr.length-1);
            System.out.println(arr[arr.length-1-i]);
        }

        //String[] ar = Arrays.copyOf(arr, 2);//напишите тут ваш код
        //System.out.println(Arrays.toString(ar));
    }
}