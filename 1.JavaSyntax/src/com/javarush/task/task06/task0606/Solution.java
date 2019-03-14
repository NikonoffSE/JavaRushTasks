package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String s = bu.readLine();
        int n = Integer.parseInt(s);
        for (int i = 0; i < s.length(); i++) {
           if(n%10%2==0)
               even++;
           else
               odd++;
            n=n/10;
        }
        System.out.println("Even: " + even +" Odd: " + odd);
    }
}
