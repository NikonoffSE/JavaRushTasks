package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<>();
        String temp;
        for (int i = 0; i > -1 ; i++) {
            temp = reader.readLine();
            if (temp.equals("end"))
                break;
            else
            s.add(temp);
        }
        for (String y:s
             ) {
            System.out.println(y);

        }//напишите тут ваш код
    }
}