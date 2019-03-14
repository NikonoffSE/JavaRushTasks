package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in)); // c:/temp/1.txt
            String f1 = bu.readLine();
            String f2 = bu.readLine();
            FileInputStream fis = new FileInputStream(f1);
            int k = fis.available();
            int [] b = new int[k];
            for (int i = 0; i < k; i++) {
                b[i]=fis.read();
        //        System.out.println(b[i]);
            }

            fis.close();
            FileOutputStream fos = new FileOutputStream(f1);
            FileInputStream fis1 = new FileInputStream(f2);
            //for (int i = 0; i < fis.available(); i++) {
               while (fis1.available()>0)
                fos.write(fis1.read());
            //}
            for (int i = 0; i < b.length; i++) {
            fos.write(b[i]);
           //     System.out.println(b[i]);
            }



            fos.close();
            fis1.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
