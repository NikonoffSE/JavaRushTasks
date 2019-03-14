package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String f1 = bu.readLine();
        String f2  = bu.readLine();
        String alph = "";
        bu.close();
        FileReader fr = new FileReader(f1);   // c:/temp/1.txt
        BufferedReader buf  = new BufferedReader( fr);
        alph = buf.readLine();
        //System.out.println(alph.length());
        //System.out.println(Character.getNumericValue(alph.charAt(0)));
        while (fr.ready()) {
            alph = alph + buf.readLine();
        }
        alph = alph.replaceAll("\\.", "!");
        FileWriter fw = new FileWriter(f2);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(alph);
        buf.close();
        bw.close();
    }
}
