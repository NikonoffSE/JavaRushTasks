package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/
public class Solution {
    public static void processThreads(Thread... threads) {
        for (Thread t: threads) {
            switch (t.getState()){
                case NEW: t.start();
                break;
                case RUNNABLE: t.isInterrupted();
                    break;
                case WAITING: t.interrupt();
                break;
                case TIMED_WAITING: t.interrupt();
                break;
                case BLOCKED:t.interrupt();
                    break;
                case TERMINATED:
                    System.out.println(t.getPriority());
                    break;
            }
        }
        //implement this method - реализуйте этот метод
    }

    public static void main(String[] args) {
    }
}
