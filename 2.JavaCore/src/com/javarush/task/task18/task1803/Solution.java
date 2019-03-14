package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer,Integer> map = new HashMap<>();
        try {
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
            String f = bu.readLine();
            FileInputStream fis = new FileInputStream(f);
            int cur;
            while (fis.available()>0) {
                cur=fis.read();
                if (map.containsKey(cur))
                    map.replace(cur,map.get(cur)+1);
                else map.put(cur, 1);
            }

            int m=0;
            for (Integer e: map.values()) {
                if (e!=null && (e>m)) {

                    m = e;
                }
            }
            for (Map.Entry<Integer,Integer> en: map.entrySet()) {
                if (en.getValue()== m) System.out.print(en.getKey() + " ");
            }
            fis.close();
            bu.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
