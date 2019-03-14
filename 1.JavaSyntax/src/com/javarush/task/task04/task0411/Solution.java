package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
       if (3 > month || month > 11)
           System.out.println("зима");
       else {
           if (6 > month & month > 2)//напишите тут ваш код
               System.out.println("весна");
           else {
               if (9 > month & month > 5)
                   System.out.println("лето");
               else
                   System.out.println("осень");
           }
       }
   }
}