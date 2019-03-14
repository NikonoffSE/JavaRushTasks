package com.javarush.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) throws  IOException {
        A a;
        try {
         a = (A) objectStream.readObject();

        if (a==null) return null;
        else
        return a;
        }
        catch (ClassNotFoundException c) {
            return null;
        }
        catch (Exception e) {
        return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
