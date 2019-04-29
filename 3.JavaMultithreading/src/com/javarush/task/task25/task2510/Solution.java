package com.javarush.task.task25.task2510;

import java.io.*;

/*
Поживем - увидим
*/
public class Solution extends Thread {

    public Solution() {

        super.setDefaultUncaughtExceptionHandler((thread,throwable)-> {


                if (throwable.getClass().getName().contains("Error"))
                    System.out.println("Нельзя дальше работать");
                else{
                    if (throwable.getClass().getName().contains("Exception"))
                        System.out.println("Надо обработать");
                    else
                        System.out.println("Поживем - увидим");
                }



        });


//throw new IllegalAccessError();
    }

    public static void main(String[] args) throws IOException {
//Solution s = new Solution();
    }
}
