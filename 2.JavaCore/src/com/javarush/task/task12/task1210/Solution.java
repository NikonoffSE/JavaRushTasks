package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max(int x, int y) {
        if (x > y)        return x;
        else return y;
    }
    public static long max(long x, long y) {

        if (x > y)        return x;
        else return y;
    }
    public static double max(double x, double y) {
        if ((x-y) > 0)
            return x;
        else
            return y;
        //return Math.max(x, y);
    }
}
