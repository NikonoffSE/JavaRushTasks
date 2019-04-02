package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
     //   System.out.println(getTokens("level22.lesson13.task01", ".").length);

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] s=new String[st.countTokens()];
        int i=0;
        while (st.hasMoreTokens()) {
        s[i]= st.nextToken() ;
        i++;
        }
    //    for (String d:s) {
      //      System.out.println(d);
//        }
        return s;
    }
}
