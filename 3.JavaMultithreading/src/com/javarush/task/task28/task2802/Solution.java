package com.javarush.task.task28.task2802;


import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишем свою ThreadFactory
*/
public class Solution {

    public static void main(String[] args) {
        class EmulatorThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulatorThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulatorThreadFactoryTask());

        thread.start();
        thread2.start();
    }



    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }

    public static class AmigoThreadFactory implements ThreadFactory{

            private static AtomicInteger A = new AtomicInteger(0);
            private final int c = A.incrementAndGet();
            private AtomicInteger B = new AtomicInteger(0);

        @Override
        public Thread newThread(Runnable r) {
            synchronized (AmigoThreadFactory.class) {
                Thread ret = new Thread(Thread.currentThread().getThreadGroup(),r, Thread.currentThread().getThreadGroup().getName() + "-pool-" + c + "-thread-" + B.incrementAndGet());
                ret.setDaemon(false);
                ret.setPriority(Thread.NORM_PRIORITY);

                return ret;
            }
        }
    }
}
