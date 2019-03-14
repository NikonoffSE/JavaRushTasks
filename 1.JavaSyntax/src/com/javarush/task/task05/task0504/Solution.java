package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //String name;
        //int age;
        //int weight;
        //int strength;
        Cat cat1 = new Cat("Bob",1,2,3);
        Cat cat2 = new Cat("Cob",2,3,4);
        Cat cat3 = new Cat("Lol",3,4,5);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}