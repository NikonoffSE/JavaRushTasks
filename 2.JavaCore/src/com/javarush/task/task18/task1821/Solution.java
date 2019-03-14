package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);//"c:/temp/1.txt");  //
            HashMap<Integer,Integer> map = new HashMap<>();
            while (fis.available()>0){
                int b = fis.read();
                if (map.containsKey(b))
                    map.replace(b, map.get(b)+1);
                else map.put(b, 1);
            }

            Integer[][] m = new Integer[map.size()][map.size()];
            int i = 0;
            for ( Map.Entry<Integer,Integer> e: map.entrySet()) {
                m[i][0]=e.getKey();
                m[i][1]=e.getValue();
                i++;
            }
            int t0 = 0;
            int t1 = 0;
            for (int j = 0; j < m.length; j++) {
                for (int k = 0; k <m.length-1 ; k++) {
                  if (m[k][0]>m[k+1][0]){
                      t0=m[k][0];
                      t1=m[k][1];
                      m[k][0]=m[k+1][0];
                      m[k][1]=m[k+1][1];
                      m[k+1][0] = t0;
                      m[k+1][1] = t1;
                  }
                }
            }
            for (int j = 0; j < m.length; j++) {
                System.out.println( (char)((int)m[j][0]) + " " + m[j][1]);  // +" " + m[j][0]
            }
            fis.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
