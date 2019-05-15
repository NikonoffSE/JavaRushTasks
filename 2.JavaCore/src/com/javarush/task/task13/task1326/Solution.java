package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));// напишите тут ваш код
        File f= new File(bin.readLine());
        BufferedReader bfile= new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        String s = bfile.readLine();
        ArrayList<Integer> arr  = new ArrayList<>();
       while (s!=null){
            if(Integer.parseInt(s)%2 == 0)
                arr.add(Integer.parseInt(s));
                s = bfile.readLine();
        }
        int t = arr.get(0);
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = 0; j < arr.size()-1; j++) {
                if (arr.get(j)>arr.get(j+1)) {
                    t = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, t);
                }
            }
        }
        for (Integer r: arr) {
            System.out.println(r);
        }
        bfile.close();

    }
}
