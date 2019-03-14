package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws  Exception{
        BufferedReader bu = new BufferedReader( new InputStreamReader(System.in));
        FileReader fr = new FileReader(bu.readLine());
        FileWriter fw = new FileWriter(bu.readLine());
        bu.close();
        ArrayList<Integer> ints = new ArrayList<>();
        int n = fr.read();
        while (n != -1) {
            ints.add(n);
            n = fr.read();
        }
        fr.close();
        for (int i = 0; i < ints.size(); i++) {
            if ((i+1)%2==0)
                fw.write(ints.get(i));
        }
        fw.close();

    }
}
