package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов","Иван");
        map.put("Петров","Иван");
        map.put("Сидоров","Иван");
        map.put("Жопошников","Иван");
        map.put("Копошун","Петр");
        map.put("Кикосюн","Петр");
        map.put("Какашкин","Петр");
        map.put("Букашкин","Петр");
        map.put("Пипиркин","Петр");
        map.put("Котофейкин","Петр");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int n = 0;
        for (Map.Entry<String, String> m: map.entrySet()) {
            if (m.getValue().equals(name))
                n++;
        }
        return  n;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int n = 0;
        for (Map.Entry<String, String> m: map.entrySet()) {
            if (m.getKey()==(lastName))
                n++;
            //System.out.println(m.getKey());
        }
        return  n;

    }

    public static void main(String[] args) {
        //System.out.println(getCountTheSameFirstName(createMap(),"Иван"));
        //System.out.println(getCountTheSameLastName(createMap(),"Иванов"));

    }
}
