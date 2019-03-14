package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       // BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        //String fname = bu.readLine();
        //bu.close();
        BufferedReader buf = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> map = new HashMap<>();  //
        String temp = "";
        String key = "";
        Double value = 0.0;
        while ((temp = buf.readLine()) != null) {
            key = temp.substring(0, temp.indexOf(" "));
            value = Double.parseDouble(temp.substring(temp.indexOf(" ") + 1));
            if (map.containsKey(key)) {
           //     System.out.println("1");
                map.replace(key, map.get(key)+value);
            } else
                map.put(key, value);
        }
        buf.close();
      String[] strings = map.keySet().toArray(new String[map.size()]);
        Arrays.sort(strings);

        for (String e: strings) {
            //if (e.getKey().equals("Петров")) System.out.println( e.getKey() + " " + e.getValue());
            //System.out.println("--------------");
            System.out.println( e + " " + map.get(e));
        }
    }
}
