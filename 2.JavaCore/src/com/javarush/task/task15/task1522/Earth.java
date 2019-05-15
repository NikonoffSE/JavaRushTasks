package com.javarush.task.task15.task1522;

public class Earth implements Planet{
    private static  Earth instance;

    public static Earth getInstance(){
        if (instance == null)
            return (instance = new Earth());
        else
            return instance;

    }

    private Earth() {
    }
}
