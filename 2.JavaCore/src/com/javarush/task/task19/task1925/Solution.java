package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //  BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
//        String fname = bu.readLine();
        //      bu.close();
        BufferedReader buf = new BufferedReader(new FileReader(args[0]));   // c:/temp/3.txt
        BufferedWriter bur = new BufferedWriter(new FileWriter(args[1]));
        String temp = "";
        int c = 0;
        String[] b;
        ArrayList<String> fin = new ArrayList<>();
        while (buf.ready()) {
            temp = buf.readLine();
            b = temp.split(" ");
            for (String s : b) {
                if (s.length() > 6)
                    fin.add(s);
            }
        }
        buf.close();
        for (int i = 0; i < fin.size() - 1; i++) {
            bur.write(fin.get(i) + ",");
        }
        bur.write(fin.get(fin.size() - 1));
        bur.close();
    }
}
