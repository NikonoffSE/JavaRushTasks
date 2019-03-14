package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

   static {
       BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
       String f1 = "";
       String f2 = "";
       try {
           f1 = bu.readLine();
           f2 = bu.readLine();
           bu.close();

           BufferedReader bin = new BufferedReader(new InputStreamReader(new FileInputStream(f1)));
           String s = bin.readLine();
           while (s != null) {
               allLines.add(s);
               s = bin.readLine();

           }
           bin.close();
           String s1;
           BufferedReader bin1 = new BufferedReader(new InputStreamReader(new FileInputStream(f2)));
           s1 = bin1.readLine();
           while (s1 != null) {
               forRemoveLines.add(s1);
               s1 = bin1.readLine();
           }
           bin1.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
       System.out.println(forRemoveLines);
       System.out.println(allLines);
   }

    public static void main(String[] args) {


        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            System.out.println("Something wrong in files");
        }


    }

    public void joinData() throws CorruptedDataException {
            if (allLines.containsAll(forRemoveLines)) {
                allLines.removeAll(forRemoveLines);
                System.out.println(allLines);
            } else {
                allLines.clear();
                System.out.println(allLines);
                throw new CorruptedDataException();
            }
    }
}
