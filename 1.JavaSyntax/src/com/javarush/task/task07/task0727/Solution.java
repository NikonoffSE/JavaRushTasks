package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> list2 = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length()%2==0)
                list2.add(s + " " + s);
            else
                list2.add(s + " " + s +" " + s);
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
