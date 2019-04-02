package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
      /*
        Map<String, String> params = new LinkedHashMap<>();
        params.put("name","Ivanov");//{name=Ivanov, country=Ukraine, city=Kiev, age=null}
        params.put("country","Ukraine");
        params.put("city","Kiev");
        params.put("age",null);
        System.out.println(getQuery(params));
      */
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (Map.Entry<String, String> e : params.entrySet()) {
            if (e.getValue() != null) {
                if (k == 0) {
                    sb.append(e.getKey() + " = '" + e.getValue() + "'");
                    k++;
                }
                else {
                    sb.append(" and " + e.getKey() + " = '" + e.getValue() + "'");
                }
            }
        }
        return sb.toString();
    }
}
