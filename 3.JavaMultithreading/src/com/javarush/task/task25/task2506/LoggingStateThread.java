package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread{
Thread thread;
    public LoggingStateThread(Thread target) {
        thread = target;
    }

    @Override
    public void run() {
        //super.run();
        State state = thread.getState();
        System.out.println(thread.getState().name());
        while (thread.getState()!=State.TERMINATED)
        if (state!= thread.getState()) {
            System.out.println(thread.getState().name());
            state = thread.getState();
        }
        System.out.println(thread.getState().name());
            this.interrupt();


    }
}
