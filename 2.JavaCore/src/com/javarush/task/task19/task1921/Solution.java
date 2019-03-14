package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {

        //BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        //String fname = bu.readLine();
        //bu.close();
        BufferedReader buf = new BufferedReader(new FileReader(args[0]));
        String temp = "";
        String[] s;
        String fio = "";
        Date date;
        while ((temp = buf.readLine()) != null) {
            s = temp.split(" ");
            fio = "";
            for (int i = 0; i < s.length - 3; i++) {
                fio = fio + s[i] + " ";
            }
            fio = fio.trim();
            date = new Date(s[s.length - 2] + "/" + s[s.length - 3] + "/" + s[s.length - 1]);
            System.out.println(fio + " " + date);
            PEOPLE.add(new Person(fio,date));
        }
        buf.close();


    }
}
