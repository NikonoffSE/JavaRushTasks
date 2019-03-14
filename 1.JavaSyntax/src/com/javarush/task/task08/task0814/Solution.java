package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();// напишите тут ваш код
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return  set;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            if (iterator.next()>10) iterator.remove();
        }
        // напишите тут ваш код
       // for (Integer in: set
         //    ) {
           // System.out.println(in);
        //}
        return set;
    }

    public static void main(String[] args) {
    //removeAllNumbersGreaterThan10(createSet()).toString();

    }
}
