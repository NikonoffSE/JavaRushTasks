package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(bu.readLine());
        }

        int n = strings.get(0).length();
        for (String s : strings) {
            if (s.length() < n) n = s.length();
        }

        for (String s : strings) {
            if (s.length() == n) System.out.println(s);
        }//напишите тут ваш код
    }
}
