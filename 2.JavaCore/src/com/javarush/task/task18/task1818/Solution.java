package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            File f = new File(bufferedReader.readLine());
            FileOutputStream fos = new FileOutputStream(f);
            FileInputStream fin1 = new FileInputStream(bufferedReader.readLine());
            FileInputStream fin2 = new FileInputStream(bufferedReader.readLine());
            while (fin1.available()>0)
                fos.write(fin1.read());
            fos.close();
            fos = new FileOutputStream(f, true);
            while (fin2.available()>0)
                fos.write(fin2.read());
            fos.close();
            fin1.close();
            fin2.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
