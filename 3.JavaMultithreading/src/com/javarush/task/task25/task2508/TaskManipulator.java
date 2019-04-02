package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {

    private Thread thread;

    @Override
    public void run() {
        try {
            while (!thread.currentThread().isInterrupted()) {
            System.out.println(Thread.currentThread().getName());

                Thread.currentThread().sleep(100);
            }
        }catch (InterruptedException e) {

//            e.printStackTrace();
            Thread.currentThread().interrupt();

        }
    }

    @Override
    public void start(String threadName) {
        thread = new Thread(this, threadName);
        thread.start();

    }

    @Override
    public void stop() {
        thread.interrupt();
    }
}
