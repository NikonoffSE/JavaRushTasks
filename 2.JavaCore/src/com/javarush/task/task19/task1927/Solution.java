package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception {
        PrintStream def = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        testString.printSomething();
        System.setOut(def);
        StringReader ir = new StringReader(baos.toString());

        BufferedReader bu = new BufferedReader(ir);
        int c = 0;
        String t;
        while ((t = bu.readLine()) != null) {
            System.out.println(t);
            if (c == 0) c++;
            else {
                c = 0;
                System.out.println("JavaRush - курсы Java онлайн");
            }

        }
        bu.close();
        ps.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
