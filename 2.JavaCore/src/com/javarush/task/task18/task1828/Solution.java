package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length >= 5 && args[0].equals("-u")) {
            String id = args[1];
            if (id.length()>8) id = id.substring(0, 8);
            String productName = "";
            for (int i = 2; i < args.length - 2; i++) {
                productName = productName + args[i] + " ";
            }
            if (productName.length()>30) productName = productName.substring(0, 30);
            //productName = (productName + "                              ").substring(0, 30);
            System.out.println(productName);
            String price = args[args.length - 2];
            String quantity = args[args.length - 1];
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));   // c:/temp/2.txt
            String fname = bu.readLine();
            bu.close();
            BufferedReader bur = new BufferedReader(new InputStreamReader(new FileInputStream(fname)));
            String s;
            LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();
            String m = "";
            while (bur.ready()) {
                s = bur.readLine();
             //   System.out.println(s);
                m = s.substring(0, 8).trim();
                lm.put(Integer.parseInt(m), s);
            }
            bur.close();
            id=setSpaces(id,8);
            productName = setSpaces(productName, 30);
            price = setSpaces(price,8);
            quantity=setSpaces(quantity,4);
            s = String.format("%-8s%-30s%-8s%-4s", id, productName, price, quantity);
            lm.replace(Integer.parseInt(id.trim()), s);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fname)));
            for (Map.Entry<Integer,String> t: lm.entrySet()) {
                bw.write(t.getValue());
                bw.newLine();
              //  System.out.println(t.getValue());
            }
            bw.close();
        }
        else {
            if (args.length == 2 && args[0].equals("-d")) {
                String id = args[1];
                BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));   // c:/temp/2.txt
                String fname = bu.readLine();
                bu.close();
                BufferedReader bur = new BufferedReader(new InputStreamReader(new FileInputStream(fname)));
                String s;
                LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();
                String m = "";
                while (bur.ready()) {
                    s = bur.readLine();
                    System.out.println(s);
                    m = s.substring(0, 8).trim();
                    lm.put(Integer.parseInt(m), s);
                }
                bur.close();
                lm.remove(Integer.parseInt(id));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fname)));
                for (Map.Entry<Integer,String> t: lm.entrySet()) {
                    bw.write(t.getValue());
                    bw.newLine();
                    System.out.println(t.getValue());
                }
                bw.close();
            }
            return;
        }
    }
    private static String setSpaces(String previousName, int count) {
        String trueName;
        if (previousName.length() > count) {
            trueName = previousName.substring(0, count);
        } else {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < (count - previousName.length()); i++) {
                s.append(" ");
            }
            trueName = previousName + s;
        }
        return trueName;
    }
}
