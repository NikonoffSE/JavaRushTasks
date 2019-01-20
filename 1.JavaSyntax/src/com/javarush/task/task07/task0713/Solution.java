package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> main = new ArrayList<>();
        ArrayList<Integer> n3 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            main.add(Integer.parseInt(bu.readLine()));
            if (main.get(i)%3 == 0)
                n3.add(main.get(i));
            if (main.get(i)%2 == 0)
                n2.add(main.get(i));
            if (main.get(i)%2 != 0 && main.get(i)%3 != 0)
                other.add(main.get(i));
        }
        printList(n3);
        printList(n2);
        printList(other);
        //напишите тут ваш код
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));//напишите тут ваш код

        }
    }
}
