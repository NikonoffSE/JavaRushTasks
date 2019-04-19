package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap();
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            int id;
            if (s.isEmpty()) break;
            else
                id = Integer.parseInt(s);
            s = reader.readLine();
            String name;
            name = s;
            if (s.isEmpty()){
                map.put(name, id);
                break;
            }

            else

            map.put(name, id);

        }
        for (Map.Entry e: map.entrySet()) {
        System.out.println(e.getValue() + " " + e.getKey());
        }
    }
}
