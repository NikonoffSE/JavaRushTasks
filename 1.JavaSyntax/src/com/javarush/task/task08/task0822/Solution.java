package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int m = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < m) m = array.get(i);
        }// Найти минимум тут
        return m;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bu.readLine());
        for (int i = 0; i < n; i++) {
        list.add(Integer.parseInt(bu.readLine()));
        }// Создать и заполнить список тут
        return list;
    }
}
