package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов","Иван");
        map.put("Петров","Иван");
        map.put("Сидоров","Иван");
        map.put("Жопошников","Иван");
        map.put("Иванов","Семен");
        map.put("Кикосюн","Сергей");
        map.put("Какашкин","Гвиан");
        map.put("Букашкин","Картон");
        map.put("Пипиркин","Позитрон");
        map.put("Котофейкин","Патрон");
        return map;
        //напишите тут ваш код

    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
