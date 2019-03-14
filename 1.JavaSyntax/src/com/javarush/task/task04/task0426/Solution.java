package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bu.readLine());
        if (a>0&&chet(a))
            System.out.println("положительное четное число");
        else {
            if (a<0&&chet(a))
                System.out.println("отрицательное четное число");
            else {
                if (a>0&&(!chet(a)))
                    System.out.println("положительное нечетное число");
                else {
                    if (a<0&&(!chet(a)))
                        System.out.println("отрицательное нечетное число");
                    else {
                        if (a == 0)
                            System.out.println("ноль");
                    }
                }

            }
        }

        //напишите тут ваш код
    }

    public static boolean chet(int a) {
        if (a%2==0) return true;
        else return false;

    }
}
