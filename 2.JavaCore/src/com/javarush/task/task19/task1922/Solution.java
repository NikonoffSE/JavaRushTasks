package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String fname = bu.readLine();
        bu.close();
        BufferedReader buf = new BufferedReader(new FileReader(fname));   // c:/temp/3.txt
        String temp = "";
        int c = 0;
        String[] b;
        while ((temp = buf.readLine()) != null) {
            for (String s : words) {
                b = temp.split(" ");
                for (int i = 0; i < b.length; i++) {
                if (b[i].equals(s))
                    c++;
            }
            }
            if (c == 2) {
                System.out.println(temp);

            }
            c = 0;
        }
        buf.close();
    }
}
