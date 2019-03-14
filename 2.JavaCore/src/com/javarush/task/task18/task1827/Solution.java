package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));   //  c:/temp/2.txt
        //FileOutputStream fos = ;
        String s = null;
        int id = 0;
        if (args.length > 0 && args[0].equals("-c")) {
            try {
                s = bu.readLine();
                bu.close();
                File f = new File(s);
                if (f.exists() && f.length() > 0) {
                    bu = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
                    s = bu.readLine();
                    while (s != null) {
                        if (id < Integer.parseInt(s.substring(0, 8).trim())) {
                          //  System.out.println(Integer.parseInt(s.substring(0, 8).trim()));
                            id = Integer.parseInt(s.substring(0, 8).trim());
                        }
                        s = bu.readLine();
                    }
                    id++;
                    bu.close();
                  //  fos.close();
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true)));
                    // System.out.println("333");

                    s = id + "";
                    s = Solution.addz(s, 8 - String.valueOf(id).length());
                    s = s + args[1];
                    s = addz(s, 30 - args[1].length());
                    s = s + args[2];
                    s = addz(s, 8 - args[2].length());
                    s = s + args[3];
                    s = addz(s, 4 - args[3].length());
                    bw.write(System.getProperty("line.separator"));
                    bw.flush();
                  //  s="\n" + s;
                    //System.out.println((s));
                   // System.out.println(s.length());
                    bw.write(s);
                    bw.flush();
                    bw.close();
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String addz(String s, int n) {
        for (int i = 0; i < n; i++) {
            s = s + " ";
        }
        return s;
    }
}
