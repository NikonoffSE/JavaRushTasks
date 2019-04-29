package com.javarush.task.task28.task2805;

public class MyThread extends Thread {
    private static int priority=0;
   {
        if (priority==10) priority=0;
        if (priority > this.getThreadGroup().getMaxPriority()) {
            setPriority(this.getThreadGroup().getMaxPriority());
            ++priority;
        }
        else
            this.setPriority(++priority);
    }
    public MyThread() {

    }

    public MyThread(Runnable target) {
        super(target);

    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);


    }

    public MyThread(String name) {
        super(name);


    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
       }

    public MyThread(Runnable target, String name) {
        super(target, name);
           }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
           }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
           }

    /*public MyThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
        super(group, target, name, stackSize, inheritThreadLocals);
        if (priority==10) priority=0;
        if (priority > this.getThreadGroup().getMaxPriority()) {
            this.setPriority(this.getThreadGroup().getMaxPriority());
            ++priority;
        }
        else
            this.setPriority(++priority);

    }*/
}
