package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bu.readLine());
        int b = Integer.parseInt(bu.readLine());
        int c = Integer.parseInt(bu.readLine());
        if (a<=b&& a>=c)
            System.out.println(a);
        else {
            if (b<=a&&b>=c)
                System.out.println(b);
            else {
                if (c <= a && c >= b)
                    System.out.println(c);
                else{
                    if (a>=b&& a<=c)
                        System.out.println(a);
                    else {
                        if(b>=a&&b<=c)
                        System.out.println(b);
                        else {
                            if (c >= a && c <= b)
                                System.out.println(c);
                        }
                    }
                }

            }
        }

            //напишите тут ваш код
    }
}
