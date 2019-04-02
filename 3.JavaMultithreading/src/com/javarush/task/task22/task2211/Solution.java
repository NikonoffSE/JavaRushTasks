package com.javarush.task.task22.task2211;

import java.io.*;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream bu = new FileInputStream(args[0]);
        String s = "";
        byte[] chars = new byte[bu.available()];
        while (bu.available()>0) {
            bu.read(chars);
            s += new String( chars, "Windows-1251");
        }
        bu.close();
        FileOutputStream fo = new FileOutputStream(args[1]);

        fo.write(s.getBytes("UTF-8"));
        fo.close();
    }
}
