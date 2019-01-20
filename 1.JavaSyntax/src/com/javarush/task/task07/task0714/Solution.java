package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = new ArrayList<>();
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            s.add(bu.readLine());
        }
        s.remove(2);
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(s.size()-1-i));
        }
    }
}


