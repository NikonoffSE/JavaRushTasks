package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat {
        String name;

       public  String getName(){
            return name;
        }

        public Cat getChild(){
            Cat c = new Cat();
            return c;
        }
    }

    public static class Dog {
        String name;

        public  String getName(){
            return name;
        }

        public Dog getChild(){
            Dog c = new Dog();
            return c;
        }

    }

}
