package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String fname = bu.readLine();
        bu.close();
        BufferedReader buf = new BufferedReader(new FileReader(fname));   // c:/temp/3.txt
        StringBuffer temp ;
        while (buf.ready()) {

            System.out.println(new StringBuffer(buf.readLine()).reverse());
        }
        buf.close();
    }
}
