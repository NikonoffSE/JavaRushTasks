package com.javarush.task.task14.task1409;

public interface Bridge {
    public default int getCarsCount(){
        return 0;
    }
}