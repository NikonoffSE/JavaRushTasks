package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String f = bu.readLine();
        bu.close();
        File file = new File(f);
        FileInputStream fis= new FileInputStream(file);
        while (fis.available()>0)
            System.out.print(Character.toChars(fis.read()));
        fis.close();
    }
}