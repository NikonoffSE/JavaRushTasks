package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {

        readData();
    }

    public static void readData() {
        ArrayList<Integer> mint = new ArrayList<>();
        try {

            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
            mint.add(Integer.parseInt(bu.readLine()));
            }//напишите тут ваш код


        }
        catch (Exception e){
           e.printStackTrace();

        }
        finally {
            for (Integer in: mint) {
                System.out.println(in);
            }
        }
    }
}
