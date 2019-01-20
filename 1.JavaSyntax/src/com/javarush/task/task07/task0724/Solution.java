package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human Vasya = new Human("Vasya", true, 65);
        Human Manya = new Human("Manya", false, 62);
        Human Kolya = new Human("Kolya", true, 65);
        Human Tanya = new Human("Tanya", false, 60);
        Human Vanya = new Human("Vanya", true, 40, Vasya, Manya);
        Human Valya = new Human("Valya", false, 38, Kolya, Tanya);
        Human Zhenya = new Human("Zhenya", true, 15, Vanya, Valya);
        Human Venya = new Human("Venya", true, 13, Vanya, Valya);
        Human Lena = new Human("Lena", false, 10, Vanya, Valya);
        System.out.println(Vasya.toString());
        System.out.println(Manya.toString());
        System.out.println(Kolya.toString());
        System.out.println(Tanya.toString());
        System.out.println(Vanya.toString());
        System.out.println(Valya.toString());
        System.out.println(Zhenya.toString());
        System.out.println(Venya.toString());
        System.out.println(Lena.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}