package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        //String[] alp = {"a", "b"};
        String m = "c:/temp/1.txt";
        try {
            if (args.length>0) m = args[0];
            FileInputStream fis = new FileInputStream(m);
            //BufferedReader bu = new BufferedReader(new InputStreamReader (new FileInputStream(args[0])));
            String s = "abcdefghijklmnopqrstuvwxyz";
            int c = 0;

            while (fis.available() > 0) {
                m = Character.toString((char)fis.read());
                if (s.contains(m.toLowerCase()))
                    c++;
            }
            System.out.println(c);
            fis.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
