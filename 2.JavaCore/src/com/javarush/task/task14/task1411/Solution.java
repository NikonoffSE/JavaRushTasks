package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        boolean i = true;

        while (i)
        {
            key = reader.readLine(); //user", "loser", "coder", "proger
            switch (key){
                case ("user"):
                    doWork(new Person.User());
                    break;
                case ("loser"):
                    doWork(new Person.Loser());
                    break;
                case ("coder"):
                    doWork(new Person.Coder());
                    break;
                case ("proger"):
                    doWork(new Person.Proger());
                    break;
                default:
                   i=false;
                   break;
            }
            //создаем объект, пункт 2

            //doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        if(person instanceof Person.User) ((Person.User) person).live();
        if(person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        if(person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        if(person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
