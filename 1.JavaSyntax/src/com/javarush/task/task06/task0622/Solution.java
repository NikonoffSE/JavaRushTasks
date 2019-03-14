package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int t;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               if (a > b){
                   t = b;
                   b = a;
                   a = t;
               } else {
                   if (b > c){
                       t = c;
                       c = b;
                       b = t;
                   } else {
                       if (c > d){
                           t = d;
                           d = c;
                           c = t;
                       } else {
                           if (d > e){
                               t = e;
                               e = d;
                               d = t;
                           }
                       }
                   }
               }
          }

        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        //напишите тут ваш код
    }

}
