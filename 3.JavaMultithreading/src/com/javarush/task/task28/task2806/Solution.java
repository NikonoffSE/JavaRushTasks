package com.javarush.task.task28.task2806;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Знакомство с Executors
*/
public class Solution {
   static AtomicInteger a = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        ExecutorService tpe= Executors.newFixedThreadPool(5);//Add your code here
        for (int i = 1; i < 11; i++) {
            tpe.submit(() -> doExpensiveOperation(a.incrementAndGet()));
        }
        tpe.shutdown();
        tpe.awaitTermination(5, TimeUnit.SECONDS);

        /* output example
pool-1-thread-2, localId=2
pool-1-thread-1, localId=1
pool-1-thread-3, localId=3
pool-1-thread-1, localId=7
pool-1-thread-1, localId=9
pool-1-thread-4, localId=4
pool-1-thread-5, localId=5
pool-1-thread-2, localId=6
pool-1-thread-1, localId=10
pool-1-thread-3, localId=8
         */
    }

    private static void doExpensiveOperation(int localId) {
        System.out.println(Thread.currentThread().getName() + ", localId="+localId);
    }
}
