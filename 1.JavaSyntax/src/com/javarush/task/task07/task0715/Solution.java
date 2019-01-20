package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = new ArrayList<>();
        Collections.addAll(s, "мама", "мыла", "раму");
        s.add(1, "именно");
        s.add(3, "именно");
        s.add(5, "именно");
        for (String n : s)
            System.out.println(n);
    }
}
