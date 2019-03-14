package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"January");
        map.put(2,"February");
        map.put(3,"March");
        map.put(4,"April");
        map.put(5,"May");
        map.put(6,"June");
        map.put(7,"July");
        map.put(8,"August");
        map.put(9,"September");
        map.put(10,"October");
        map.put(11,"November");
        map.put(12,"December");
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String s = bu.readLine();
        for (Map.Entry<Integer, String> e: map.entrySet()
             ) {
            if(e.getValue().equals(s))
                System.out.println(s + " is the " + e.getKey() + " month");
        }


    }
}
