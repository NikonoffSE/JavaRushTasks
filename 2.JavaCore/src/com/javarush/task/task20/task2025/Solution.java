package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

/*
Алгоритмы-числа
*/
public class Solution {
    static long[][] m = new long[10][21];

    public static long[] getNumbers(long N) {
       // mas(2,2);
      //  mas(2,2);
        //System.out.println(Long.MAX_VALUE);
        init();
        long[] result = null;
        ArrayList<Long> l = new ArrayList<>();
        int k = 0;
        long n = 0;
        long m = 0;
        long c = 0;
        boolean b = false;
        String s;
        int length;
        long temp;
      /*  for (int i = 1; i < 10; i++) {
            System.out.println(i);
            c++;
            k++;
        }*/
        for (int i = 1; i <= N; i++) {
            s = String.valueOf(i);
            char[] data = s.toCharArray();
            length = data.length;
            n = 0;
            m = 0;
            b = true;
            for (int j = 0; j < length - 1; j++) {
                long a = Integer.parseInt(String.valueOf(data[j]));
                long d = Integer.parseInt(String.valueOf(data[j+1]));
                b = b && a <= d;
            }
            if (b) {
                c++;
                for (int j = 0; j < length; j++) {
                    n +=  mas(Integer.parseInt(s.substring(j, j + 1)), length);
                   // n += (long) m[1][1];//m[Integer.parseInt(s.substring(j, j + 1))][ length];
                }
                s = String.valueOf(n);
                length = s.length();
                for (int j = 0; j < s.length(); j++) {
                    m += mas(Integer.parseInt(s.substring(j, j + 1)), length);
                }

                if (n ==m) {
                    // System.out.println(n + "" + i);
                    if(!l.contains(n)) {
                        l.add((long) n);
                        k++;
                    }
                }

            }
        }
         System.out.println(c);
        if (l.size() > 0) {
            result = new long[l.size()];
            for (int i = 0; i < l.size(); i++) {
                result[i] = l.get(i);
            }
            return result;

        } else return null;

    }

    public static long mas(int n, int p) {
        //long l;
    //    if (m[n][p] != 0) {
        //    System.out.println("1");
      //      return m[n][p];
//        } else {
//            System.out.println("2");
  //          m[n][p] =(int)Math.pow(n, p);
            return m[n][p];
    //    }

    }
    public static void init(){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j <m[i].length ; j++) {
                m[i][j] =(long)Math.pow(i, j);
            }

        }
    }

    public static void main(String[] args) {
        Date d1 = new Date();
        long[] result = getNumbers(100000000);
        Date d2 = new Date();
        if (result.length > 0) {
            for (int i = 0; i < result.length; i++) {

                System.out.println(result[i]);
            }
            System.out.println("Время выполнения: " + (d2.getTime() - d1.getTime()));
        }

    }


}
