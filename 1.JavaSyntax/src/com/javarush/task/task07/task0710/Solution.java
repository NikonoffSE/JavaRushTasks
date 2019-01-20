package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> a = new ArrayList<>();
        BufferedReader bu = new BufferedReader( new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            a.add(0, bu.readLine());
        }
        for (String s : a)
            System.out.println(s);
    }
}
