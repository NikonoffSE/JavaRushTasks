package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            int number = Integer.parseInt(bu.readLine());
            sum = sum + number;
            if ( number == -1) {
                System.out.println(sum);
                break;
            }

        }
        //напишите тут ваш код
    }
}
