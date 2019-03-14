package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream outt=System.out;
        ByteArrayOutputStream baut = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baut);
        System.setOut(printStream);
        testString.printSomething();
        String s = baut.toString().replace("te","??");
        System.setOut(outt);
        System.out.println(s);
        printStream.close();




    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
