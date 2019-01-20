package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> a = new ArrayList<>();
        BufferedReader bu = new BufferedReader( new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            a.add(bu.readLine());
        }

        for (int i = 0; i < 13; i++) {
            String s = a.get(a.size()-1);
            a.remove(a.size()-1);
            a.add(0, s);
        }
        for (String m : a) {
            System.out.println(m);
        }

        //напишите тут ваш код
    }
}
