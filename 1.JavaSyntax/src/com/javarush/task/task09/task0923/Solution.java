package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String s = bu.readLine();
        String s1 = "";
        String s2 = "";
        Character c = new Character(' ');
        for (int i = 0; i < s.length(); i++) {
            //c=s.charAt(i);
            if(isVowel(s.charAt(i)))
                s1= s1+s.charAt(i) + " ";
            else
            if(s.charAt(i)!= c)
                s2= s2+s.charAt(i) + " ";
        }
        System.out.println(s1);//напишите тут ваш код
        System.out.println(s2);//напишите тут ваш код

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}