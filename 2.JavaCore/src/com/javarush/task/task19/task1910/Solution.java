package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String f1 = bu.readLine();
        String f2  = bu.readLine();
        String alph = "";
        bu.close();
        FileReader fr = new FileReader(f1);   // c:/temp/1.txt
        BufferedReader buf  = new BufferedReader( fr);
        alph = "";
        String c = buf.readLine();
        while (c!=null) {
            alph = alph + c;
            c= buf.readLine();
        }
        alph = alph.replaceAll("\\p{Punct}", "");
        alph = alph.replaceAll("\n", "");
        FileWriter fw = new FileWriter(f2);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(alph);
        buf.close();
        bw.close();
    }
}
