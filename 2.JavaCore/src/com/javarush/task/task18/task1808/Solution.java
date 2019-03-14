package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in)); // c:/temp/3.txt
            String f1 = bu.readLine();
            String f2 = bu.readLine();
            String f3 = bu.readLine();
            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fo1 = new FileOutputStream(f2);
            FileOutputStream fo2 = new FileOutputStream(f3);
            int fa = fis.available();
            if (fa%2==0){
                byte[] b1 = new byte[fa/2];
                fis.read(b1);
                fo1.write(b1);
                fis.read(b1);  //,fa/2+1, fa);
                fo2.write(b1);

            }
            else {
                byte[] b1 = new byte[fa/2+1];
                fis.read(b1);
                fo1.write(b1);
                byte[] b2 = new byte[fa/2];
                fis.read(b2);  //,fa/2+2, fa-1);
                fo2.write(b2);

            }
            bu.close();
            fis.close();
            fo1.close();
            fo2.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
