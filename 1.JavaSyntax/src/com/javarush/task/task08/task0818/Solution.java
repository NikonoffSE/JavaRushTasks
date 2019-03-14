package com.javarush.task.task08.task0818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        map.put("Иванов",100);
        map.put("Петров",200);
        map.put("Сидоров",700);
        map.put("Жопошников",1000);
        map.put("Копошун",1200);
        map.put("Кикосюн",300);
        map.put("Какашкин",2700);
        map.put("Букашкин",520);
        map.put("Пипиркин",3000);
        map.put("Котофейкин",620);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //System.out.println(map.size());
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()){
            if (it.next().getValue()<500) it.remove();
        }
        //System.out.println(map.size());
    }

    public static void main(String[] args) {
    //removeItemFromMap(createMap())
    }
}