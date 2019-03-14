package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            int a = 42 / 0;
        }
        catch (ArithmeticException e){
            System.out.println("Перехвачено исключение типа:"+ e.getClass() + e.getMessage());
        }
        //int a = 42 / 0;
        //напишите тут ваш код
    }
}
