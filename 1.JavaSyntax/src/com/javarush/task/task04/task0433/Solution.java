package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 1;
        int j = 1;
        while (i<11)        {
            while (j<11) {
                System.out.print("S");
                j++;
            }
            j=1;
            i++;
            System.out.println("");
        }
        //напишите тут ваш код

    }
}
