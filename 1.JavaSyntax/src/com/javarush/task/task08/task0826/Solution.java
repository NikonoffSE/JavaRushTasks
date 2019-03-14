package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
           temp[i]= array[array.length - 1 - i];
        }
        System.arraycopy(temp,0,array,0, array.length);
        //array = temp;
        //System.out.println(Arrays.toString(temp));
        //List<Object> l = Arrays.asList(array);
        //Collections.reverse(l);
        //array = l.toArray();//напишите тут ваш код
    }
}
