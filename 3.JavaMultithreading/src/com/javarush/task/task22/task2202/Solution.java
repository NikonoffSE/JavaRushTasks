package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {

        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        int c = 0;
        int last = 0;
        String temp = string;
        if (string == null || string.split(" ").length < 5)
            throw new TooShortStringException();
        //System.out.println(string.split(" ").length);
        while (c < 5) {
            last = temp.indexOf(" ", last+1);
            //System.out.println(last);
            c++;
        }

        //temp = temp.substring(temp.indexOf("\u0020") + 2);
        // System.out.println(temp);
        //  c++;
        //  System.out.println(c);
//            }
    if (last!=-1)
        return string.substring(string.indexOf(" ") + 1, last);
    else
        return string.substring(string.indexOf(" ") + 1);
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
