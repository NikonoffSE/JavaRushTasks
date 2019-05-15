package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        File fname = new File(bin.readLine());


           BufferedWriter bout = new BufferedWriter(new FileWriter(fname));
           String s = "";
           while (true){
               s = bin.readLine();
               if (s.equals("exit")) {
                   bout.write(s);
                   bout.close();
                   break;
               }
               else {
                   bout.write(s);
                   bout.newLine();
               }
           }


        bin.close();
    }
}
