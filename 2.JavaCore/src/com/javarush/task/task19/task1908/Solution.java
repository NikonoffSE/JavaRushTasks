package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String f1 = bu.readLine();
        String f2  = bu.readLine();
        String alph = "";
        bu.close();
        int count = 0;
        FileReader fr = new FileReader(f1);   // c:/temp/1.txt
        BufferedReader buf  = new BufferedReader( fr);
       alph = buf.readLine();
        while (fr.ready()) {
            alph = alph + buf.readLine();
            //c = (char)fr.read();
            //System.out.println(alph);
        }
        System.out.println(alph);
        alph = alph.replaceAll("\n", " ");
        String[] alphs = alph.split(" ");

        FileWriter fw = new FileWriter(f2);
        BufferedWriter bw = new BufferedWriter(fw);

        for (String s: alphs) {

            s = s.trim().replaceAll("\\D", "-");
           // System.out.println( s);
            if (!s.trim().contains("-"))

                bw.write(s + " ");

        }
        //alph = alph.replaceAll("\\D", " ");
        //System.out.println(alph);

       // fw.close();
        bw.close();
      //  fr.close();
        buf.close();


    }
}
