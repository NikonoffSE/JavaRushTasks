package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String name = bu.readLine();
        int y = Integer.parseInt(bu.readLine());
        int m = Integer.parseInt(bu.readLine());
        int d = Integer.parseInt(bu.readLine());
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);
        //напишите тут ваш код
    }
}
