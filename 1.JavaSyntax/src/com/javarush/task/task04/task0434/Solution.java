package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 1;
        int j = 1;
        while (i<11)        {
            while (j<11) {
                System.out.print(i*j + " ");
                j++;
            }
            j=1;
            i++;
            System.out.println("");
        }
        //напишите тут ваш код

    }
}
