package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
       // BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        //String fname = bu.readLine();
        //bu.close();
        BufferedReader buf = new BufferedReader(new FileReader(args[0]));   // c:/temp/3.txt
        BufferedWriter bur = new BufferedWriter(new FileWriter(args[1]));
        String temp = "";
        int c = 0;
        String[] b;
        while ((temp = buf.readLine()) != null) {
            b = temp.split(" ");
            for (int i = 0; i < b.length; i++) {
                if (b[i].matches(".*\\d.*")) //System.out.println(b[i]);
                    bur.write(b[i] + " ");
            }
        }

        buf.close();
        bur.close();
    }
}
