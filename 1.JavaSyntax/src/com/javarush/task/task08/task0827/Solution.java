package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date d = new Date(date);
        //System.out.println(d);
        Calendar cal=new GregorianCalendar();
        cal.setTime(d);
        //System.out.println(cal.get(Calendar.DAY_OF_YEAR));

        return cal.get(Calendar.DAY_OF_YEAR)%2 != 0 ? true: false;
    }
}
