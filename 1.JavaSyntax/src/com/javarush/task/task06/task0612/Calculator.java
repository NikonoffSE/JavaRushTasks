package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        double d = Double.parseDouble(Integer.toString(a)) / Double.parseDouble(Integer.toString(b));
        System.out.println(d);
        return d;
    }

    public static double percent(int a, int b) {
        double d = Double.parseDouble(Integer.toString(a)) / 100 * Double.parseDouble(Integer.toString(b));
        System.out.println(d);
        return  d;
    }

    public static void main(String[] args) {
    //division(1,2);
    //percent(90, 4);
    }
}