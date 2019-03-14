package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        //Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        sort(array);
        //System.out.println(isGreaterThan("a","b"));
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        String temp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {

            if (isGreaterThan(array[j], array[j+1])) {
                temp = array[j];
                array[j]=array[j+1];
                array[j+1] = temp;
            }
            }
        }//напишите тут ваш код
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
