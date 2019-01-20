package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(bu.readLine());
        }
        int n = strings.get(0).length();
        int m = 0;
        for (int i = 0; i < strings.size(); i++) {
            String s =  strings.get(i);
            if (s.length() < n) {
                n = s.length();
                m = i;
            }
        }

        int k = strings.get(0).length();
        int b = 0;
        for (int i = 0; i < strings.size(); i++) {
            String s =  strings.get(i);
            if (s.length() > k) {
                k = s.length();
                b = i;
            }
        }
        System.out.println(m < b ? strings.get(m) : strings.get(b));
        //напишите тут ваш код
    }
}
