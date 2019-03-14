package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов","Иван");
        map.put("Петров","Иван");
        map.put("Сидоров","Иван");
        map.put("Жопошников","Иван");
        map.put("Копошун","Семен");
        map.put("Кикосюн","Сергей");
        map.put("Какашкин","Гвиан");
        map.put("Букашкин","Картон");
        map.put("Пипиркин","Позитрон");
        map.put("Котофейкин","Патрон");
        return map;//напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //System.out.println(map.size());
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            String s = pair.getValue();
            String k = pair.getKey();
            for (Map.Entry<String, String> pair2 : copy.entrySet())
            {
                if(pair2.getValue().equals(s) && !pair2.getKey().equals(k))
                    removeItemFromMapByValue(map, s);
            }
        }
       // System.out.println(map.size());
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
  removeTheFirstNameDuplicates(createMap());
    }
}
