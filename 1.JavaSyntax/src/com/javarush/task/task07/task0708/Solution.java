package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();

        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(bu.readLine());
        }

        int n = 0;
        for (String s : strings) {
            if (s.length() > n) n = s.length();
        }

        for (String s : strings) {
            if (s.length() == n) System.out.println(s);
        }

    }

    }
