package com.javarush.task.task08.task0816;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Shwarz", df.parse("JUNE 2 1989"));
        map.put("Peart", df.parse("JUNE 3 1988"));
        map.put("Small", df.parse("JUNE 4 1987"));
        map.put("Stullone", df.parse("JUL 5 1986"));
        map.put("Still", df.parse("AUG 6 1985"));
        map.put("Stale", df.parse("SEP 7 1984"));
        map.put("Salo", df.parse("OCT 8 1983"));
        map.put("Sone", df.parse("JUNE 9 1982"));
        map.put("Sillon", df.parse("JUNE 1 1981"));
        //System.out.println(map.size());
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()) {
         Date m = it.next().getValue();
            if (m.toString().contains("Jun"))
                it.remove();
            if (m.toString().contains("Jul"))
                it.remove();
            if (m.toString().contains("Aug"))
                it.remove();
            //напишите тут ваш код
        }
        //System.out.println(map.size());
    }

    public static void main(String[] args) throws  Exception{
        //HashMap<String, Date> m;
       // removeAllSummerPeople( createMap());
        //removeAllSummerPeople(m);
        //System.out.println(m.size());
    }
}
