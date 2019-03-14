package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bur = new BufferedReader(new InputStreamReader (System.in));//напишите тут ваш код
        int n = Integer.parseInt(bur.readLine());
        if (n == 0)
            System.out.println(0);
        else {
            if (n > 0) {
                n = n * 2;
                System.out.println(n);
            }
            else {
                n = n +1;
                System.out.println(n);
            }
        }
    }

}