package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader bu = new BufferedReader( new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(i, Integer.parseInt(bu.readLine()));
        }//напишите тут ваш код
        Integer n = 1;
        Integer t = 1;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))){
              ++t;
            //System.out.println(t + " " + i + list.get(i));
                if (t > n)
                    n = t;
            }
            else {
                if (t > n)
                    n = t;
                //System.out.println(t + " " + i + list.get(i));
                t = 1;
            }
        }
        System.out.println(n);
    }
}