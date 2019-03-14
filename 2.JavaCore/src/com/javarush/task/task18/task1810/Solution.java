package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        try {
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in)); // c:/temp/3.txt c:/temp/PSVer.txt
            FileInputStream fin;
            String f = bu.readLine();
            fin = new FileInputStream(f);
            while (fin.available() >= 1000) {
                f = bu.readLine();
                fin = new FileInputStream(f);
            }
            bu.close();
            fin.close();
            throw new DownloadException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class DownloadException extends Exception {

    }
}
