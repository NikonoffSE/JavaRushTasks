package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Human son = new Human("Петя", true, 25, new ArrayList<Human>());
        Human dot = new Human("Валя", false, 20, new ArrayList<Human>());
        Human dot2 = new Human("Аля", false, 22, new ArrayList<Human>());
        Human papa = new Human("Коля", true, 45, new ArrayList<Human>(Arrays.asList(dot, son, dot2)));
        Human mama = new Human("Таня", false, 40, new ArrayList<Human>(Arrays.asList(dot, son, dot2)));
        Human ded1 = new Human("Вася", true, 65, new ArrayList<Human>(Arrays.asList(papa)));
        Human baba1 = new Human("Маша", false, 60, new ArrayList<Human>(Arrays.asList(papa)));
        Human ded = new Human("Жора", true, 60, new ArrayList<Human>(Arrays.asList(mama)));
        Human baba = new Human("Жанна", false, 55, new ArrayList<Human>(Arrays.asList(mama)));
        System.out.println(ded.toString());
        System.out.println(baba.toString());
        System.out.println(ded1.toString());
        System.out.println(baba1.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(son.toString());
        System.out.println(dot.toString());
        System.out.println(dot2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;


        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
