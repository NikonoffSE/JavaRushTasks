package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name;
        int num;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        name = bufferedReader.readLine();
        num = Integer.parseInt(bufferedReader.readLine());
        System.out.println(name + " захватит мир через " + num + " лет. Му-ха-ха!");//напишите тут ваш код

    }
}
