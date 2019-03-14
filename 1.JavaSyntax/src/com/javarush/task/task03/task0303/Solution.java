package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(55, 1.12));//напишите тут ваш код
        System.out.println(convertEurToUsd(100, 1.13));
    }

    public static double convertEurToUsd(int eur, double course) {
        double d = eur * course;
        return d;//напишите тут ваш код
    }
}
