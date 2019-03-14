package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args)throws Exception{

        //BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        //String fname = bu.readLine();
        //bu.close();
        BufferedReader buf = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> map = new HashMap<>();  //        c:/temp/3.txt
        String temp = "";
        String key = "";
        Double value = 0.0;
        while ((temp = buf.readLine()) != null) {
            key = temp.substring(0, temp.indexOf(" "));
            value = Double.parseDouble(temp.substring(temp.indexOf(" ") + 1));
            if (map.containsKey(key)) {
                map.replace(key, map.get(key)+value);
            } else
                map.put(key, value);
        }
        buf.close();
        Double[] d = map.values().toArray(new Double[map.size()]);
        Arrays.sort(d);
        //System.out.println(d[0].compareTo(d[1]));
        ArrayList<String> s = new ArrayList<>();

        for (Map.Entry<String, Double> e: map.entrySet()) {
            if (d[d.length-1]-e.getValue()<0.0001)
            s.add(e.getKey());//System.out.println( e.getKey());
    }
        Collections.sort(s);
        for (String l: s
             ) {
            System.out.println(l);
        }
}
}
