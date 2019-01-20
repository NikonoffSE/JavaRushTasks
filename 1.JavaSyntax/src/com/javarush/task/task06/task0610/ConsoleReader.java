package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        return bu.readLine();
    }

    public static int readInt() throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bu.readLine());
    }

    public static double readDouble() throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(bu.readLine());

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(bu.readLine());
    }

    public static void main(String[] args) {

    }
}
