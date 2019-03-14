package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream defPS = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);
        testString.printSomething();
        String s = baos.toString();
        System.setOut(defPS);
  //    System.out.println(s);
       // s=s.substring(0,s.length()-2);
        String[] strings = s.split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[2]);
        if (strings[1].equals("+"))
            System.out.print(s + (a + b));
        if (strings[1].equals("-"))
            System.out.print(s + (a - b));
        if (strings[1].equals("*"))
            System.out.print(s + (a * b));
        printStream.close();


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

