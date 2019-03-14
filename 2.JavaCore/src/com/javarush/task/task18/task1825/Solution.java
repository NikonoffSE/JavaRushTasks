package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
            String temp;
            HashMap<Integer, String> al = new HashMap<>();
            while (true) {
                temp = bu.readLine();
                if (!(temp.equals("end"))) {
                    System.out.println(temp.substring(temp.lastIndexOf(".") + 5));
                    al.put(Integer.parseInt(temp.substring(temp.lastIndexOf(".") + 5)), temp);
                } else break;
            }
            bu.close();
            for (Map.Entry<Integer, String> e : al.entrySet()) {        //   c:/temp/avi.part1
                System.out.println(e.getKey() + " " + e.getValue());
            }
            System.out.println(al.get(1).substring(0, al.get(1).lastIndexOf(".")));
            FileOutputStream fos = new FileOutputStream(al.get(1).substring(0, al.get(1).lastIndexOf(".")), true);
            FileInputStream fis;
            byte[] t;
            for (int i = 1; i <= al.size(); i++) {
                fis = new FileInputStream(al.get(i));
                t = new byte[fis.available()];
                fis.read(t);
                fos.write(t);
                fis.close();
            }
            fos.close();
        } catch (IOException e) {

        }
    }
}
