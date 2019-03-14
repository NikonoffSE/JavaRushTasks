package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        //divideByZero();
        try {
            divideByZero();
        }
        catch (Exception e){
        //StackTraceElement[] s = e.getStackTrace();
          //  for (StackTraceElement stackTraceElement: s) {
            //    System.out.println(stackTraceElement.getClassName() + " " +
            //}
        e.printStackTrace();
        }
    }

    public static void divideByZero() {

        int x = 2;
        System.out.println( x/ 0);

    }

}
