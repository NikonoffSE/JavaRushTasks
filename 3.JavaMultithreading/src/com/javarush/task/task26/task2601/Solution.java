package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
        Integer[] a = new Integer[]{13, 8, 15, 5, 17};
        sort(a);

/*        for (Integer i : a) {
            System.out.print(i + " ");  //дебажим
        }
*/
    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        int med;
        if (array.length % 2 == 0)
            med = (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
        else
            med = array[array.length / 2];//ищем медиану




        // System.out.println(med);  // дебажим

/*        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(Math.abs(med - o1), Math.abs(med - o2));   //анонимный компаратор
            }
        }); */
        //Arrays.sort(array, Comparator.comparingInt(i -> Math.abs(med - i)));  //  лямбда c методом компаратора
         Arrays.sort(array, (o1, o2) -> Integer.compare(Math.abs(med - o1), Math.abs(med - o2))); //лямбда
        return array;
    }
}
