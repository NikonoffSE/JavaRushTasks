package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = n[0];
        int minimum = n[0];
        for (int i = 1; i < n.length; i++) {
            if (maximum < n[i])
                 maximum = n[i];
            if (n[i] < minimum)
                minimum = n[i];
        }

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
