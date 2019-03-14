package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String fname = bu.readLine();
        bu.close();
        BufferedReader buf = new BufferedReader(new FileReader(fname));   // c:/temp/3.txt
        String t;
        String[] b;
        while ((t = buf.readLine()) != null) {
            // b=t.split(" ");
            for (Map.Entry<Integer, String> e : map.entrySet()) {
                //if (t.matches("\\b" + e.getKey() + "\\b")) {
                   t = t.replaceAll("\\b" + e.getKey() + "\\b", e.getValue());
               // }

            }
            System.out.println(t);
        }
        buf.close();
    }
}
