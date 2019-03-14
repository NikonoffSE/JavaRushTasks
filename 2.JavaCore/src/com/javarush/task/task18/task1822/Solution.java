package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in)); // c:/temp/1.txt
            String f = bu.readLine();
            BufferedReader b = new BufferedReader( new InputStreamReader( new FileInputStream(f)));
            String s = b.readLine();
            String i = args[0];
            while   (s!=null) {
                if (s.startsWith(i + " ")){
                    System.out.println(s);
                    break;
                }
                else {
                    s= b.readLine();

                }
            }
        bu.close();
            b.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
