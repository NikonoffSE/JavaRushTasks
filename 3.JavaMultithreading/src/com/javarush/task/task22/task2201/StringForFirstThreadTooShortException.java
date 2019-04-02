package com.javarush.task.task22.task2201;

public class StringForFirstThreadTooShortException extends RuntimeException {
    public String aStringForFirstThreadTooShortException(Thread t, Throwable e, String string) {
        System.out.println("java.lang.StringIndexOutOfBoundsException: String index out of range: -1");
        return "java.lang.StringIndexOutOfBoundsException: String index out of range: -1";
    }




    public StringForFirstThreadTooShortException(StringIndexOutOfBoundsException e) {

    }

}
