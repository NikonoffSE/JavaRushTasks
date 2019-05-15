package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        //String[] s = new String[1000];
        int i = 0;
        String temp = "";
        CharSequence ch = ".";

        while (!(temp.equals("exit"))){

               try {
                   temp = bu.readLine();

                       if (temp.contains(ch)) {
                           print(Double.parseDouble(temp));
                       } else {
                           if (0 < Integer.parseInt(temp) && Integer.parseInt(temp) < 128)
                               print((short) Integer.parseInt(temp));
                           else {
                               if (0 >= Integer.parseInt(temp) || Integer.parseInt(temp) >= 128)
                                   print(Integer.parseInt(temp));
                               else
                                   print(temp);
                           }
                       }
                   //Тяжко зашла. Пришлось решать через регулярные выражения. Оставляю подсказку:
                   //1) Проверка на все знаковые целые числа
                   //line.matches("-?\\d+")
                   //2) Проверка на знаковые числа с точкой
                   //line.matches("^-?\\d+\\.\\d+$")

               }
               catch (NumberFormatException e) {
                   if(temp.equals("exit"))
                       break;
                   print(temp);
               }


        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
