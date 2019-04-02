package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new FileReader(bu.readLine()));
        bu.close();
        String s = "";
        while (in.ready()) {
            s += in.readLine() + " ";
        }
        in.close();
        StringBuilder result = getLine(s.split(" ")); // c:/Temp/1.txt
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if (words.length == 0) return new StringBuilder();
        ArrayList<String> res = new ArrayList<String>();
        String t;
        for (int i = 0; i < words.length; i++) {
          //  for (int m = 0; m < 10000; m++) {


            ArrayList<String> temp = new ArrayList<String>(Arrays.asList(words));
                t = words[i];
                temp.remove(i);
               // System.out.println(Arrays.asList(words));
                //System.out.println(temp);

            Collections.shuffle(temp, new Random(100));
            int counter = 0;
            for (int k = 0; k < temp.size()+words.length; k++) {
                for (int j = 0; j < temp.size(); j++) {
                   // System.out.println(t);
                   // System.out.println(temp);
                    if (t.toUpperCase().charAt(0) == temp.get(j).toUpperCase().charAt(temp.get(j).length() - 1)) {
                        t = temp.get(j) + " " + t;
                        temp.remove(j);

                        //  System.out.println(t);
                    } else {
                        if (t.toUpperCase().charAt(t.length() - 1) == temp.get(j).toUpperCase().charAt(0)) {
                            t = t + " " + temp.get(j);
                            temp.remove(j);
                            //   System.out.println(t);
                        } else {

                        }
                    }
                }
                res.add(t);
            //}

        }
        }
        StringBuilder sb = new StringBuilder();
        t = res.get(0);
        for (int i = 1; i < res.size(); i++) {
            if (t.length() < res.get(i).length())
                t = res.get(i);
        }

        sb.append(t);
        return sb;
    }
}
