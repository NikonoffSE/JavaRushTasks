package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;// Напишите тут ваши переменные и конструкторы
        private int age;// Напишите тут ваши переменные и конструкторы
        private boolean single;
        private int height;
        private boolean sex;
        private int weight;

        public Human() {
        }

        public Human(String name, int age, boolean single, int height, boolean sex, int weight) {
            this.name = name;
            this.age = age;
            this.single = single;
            this.height = height;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, int age, int height, boolean sex, int weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean single) {
            this.name = name;
            this.age = age;
            this.single = single;
        }

        public Human(String name, int age, boolean single, boolean sex) {
            this.name = name;
            this.age = age;
            this.single = single;
            this.sex = sex;
        }

        public Human(String name, int age, boolean single, int height, int weight) {
            this.name = name;
            this.age = age;
            this.single = single;
            this.height = height;
        }

        public Human(String name, int age, int height, int weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int height, boolean sex, int weight) {
            this.name = name;
            this.height = height;
            this.sex = sex;
            this.weight = weight;
        }
        // Напишите тут ваши переменные и конструкторы
    }
}
