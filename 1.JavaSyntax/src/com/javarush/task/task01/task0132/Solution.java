package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String st = Integer.toString(number);
        int t = Integer.parseInt( st.substring(0,1)) + Integer.parseInt( st.substring(1,2)) + Integer.parseInt( st.substring(2,3));
        return  t;
    }
}