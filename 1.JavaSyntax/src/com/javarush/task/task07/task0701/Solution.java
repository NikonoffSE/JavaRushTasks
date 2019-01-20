package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));// создай и заполни массив
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(bu.readLine());
            arr[i] = n;
        }
        return arr;
    }

    public static int max(int[] array) {
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > s)
                s = array[i];
        }// найди максимальное значение
        return s;
    }
}
