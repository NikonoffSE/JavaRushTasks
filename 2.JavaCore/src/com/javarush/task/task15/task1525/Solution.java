package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
        static {
            try {
                BufferedReader bu = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME), "Cp1251"));
                String s = bu.readLine();

                while (s!=null) {
                    lines.add(s);
                    s = bu.readLine();
                }
                for (String ss: lines) {
                    System.out.println(ss);
                }

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
