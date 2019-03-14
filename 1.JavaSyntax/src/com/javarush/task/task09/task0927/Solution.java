package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Bob", new Cat("Bob"));
        map.put("Cob", new Cat("Cob"));
        map.put("Nob", new Cat("Nob"));
        map.put("Mob", new Cat("Mob"));
        map.put("Zob", new Cat("Zob"));
        map.put("Xob", new Cat("Xob"));
        map.put("Sob", new Cat("Sob"));
        map.put("Dob", new Cat("Dob"));
        map.put("Fob", new Cat("Fob"));
        map.put("Gob", new Cat("Gob"));
        return map;//напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        set.addAll(map.values());
        return  set;//напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
