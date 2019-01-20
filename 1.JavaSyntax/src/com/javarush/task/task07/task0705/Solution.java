package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] n = new int[20];
        int[] m = new int[10];
        int[] k = new int[10];
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(bu.readLine());
        }
        System.arraycopy(n, 0, m, 0, 10);
        System.arraycopy(n, 10, k, 0, 10);
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
        //напишите тут ваш код
    }
}
