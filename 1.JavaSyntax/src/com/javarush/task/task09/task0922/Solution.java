package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        Date d;

        //d = new Date(bu.readLine());
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        d = sf.parse(bu.readLine());
        //System.out.println(d);
        SimpleDateFormat sf1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH); //AUG 18, 2013
        System.out.println(sf1.format(d).toUpperCase());
        //Date date = new Date();//напишите тут ваш код
        //System.out.println(sf.format( date ));

    }
}
