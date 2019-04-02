package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException{
        int c = 0;
        int last = 0;
        String temp = string;
        if (string == null || string.split("\t").length < 3)
            throw new TooShortStringException();
        //System.out.println(string.split(" ").length);
        //while (c < 2) {
            last = temp.indexOf("\t", temp.indexOf("\t")+1);
            //System.out.println(last);
          //  c++;
        //}

        //temp = temp.substring(temp.indexOf("\u0020") + 2);
        // System.out.println(temp);
        //  c++;
        //  System.out.println(c);
//            }
        if (last!=-1)
            return string.substring(string.indexOf("\t") + 1, last);
        else
            return string.substring(string.indexOf("\t") + 1);

    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("d\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
