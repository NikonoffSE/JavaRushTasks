package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String f = bu.readLine();
        String alph = "";
        bu.close();
        int count = 0;
        FileReader fr = new FileReader(f);   // c:/temp/1.txt
        int c = fr.read();
        while (fr.ready()) {
            alph = alph + (char)c;
            c = (char)fr.read();
            //System.out.println(alph);
        }
       // System.out.println(alph);
        alph = alph.replaceAll("\\p{Punct}", " ");
        //System.out.println(alph);
        alph = alph.replaceAll("\n", " ");
        //System.out.println(alph);
        String[] alphs = alph.split(" ");
        for (String t: alphs) {
            if (t.matches("world"))
                count++;
        }
        System.out.println(count);

        fr.close();














 /*       int n = 0;
        int m =0;
        int c = fr.read();
       // System.out.println(c);
        while (c != -1) {
            //System.out.print((char) c);
            if (String.valueOf((char) c).equals("w")&&(!alph.contains(String.valueOf((char) m)))) {
                c = fr.read();
                if ( c==13) {c = fr.read(); c = fr.read();}
                //System.out.println(Character.getNumericValue(System.lineSeparator().charAt(0)));
                if (String.valueOf((char) c).equals("o")) {
                    c = fr.read();
                    if ( c==13) {c = fr.read(); c = fr.read();}
                    if (String.valueOf((char) c).equals("r")) {
                        c = fr.read();
                        if ( c==13) {c = fr.read(); c = fr.read();}
                        if (String.valueOf((char) c).equals("l")) {
                            c = fr.read();
                            if ( c==13) {c = fr.read(); c = fr.read();}
                            m = fr.read();
                            if (String.valueOf((char) c).equals("d") && (!alph.contains(String.valueOf((char) m)))) {
                                //System.out.println("+1");
                                n++;
                            }
                            else {
                                m = fr.read();
                                if ( m==13) {m = fr.read(); m = fr.read();}
                                c = fr.read();
                            }
                        }
                        else c = fr.read();
                    }
                    else c = fr.read();
                }
                else c = fr.read();
            }
           else c = fr.read();
        }
        fr.close();
        System.out.println(n);
    */
    }
}
