package com.javarush.task.task27.task2707;

/* 
Определяем порядок захвата монитора
*/
public class Solution {
    public void someMethodWithSynchronizedBlocks(Object obj1, Object obj2) {
        synchronized (obj1) {
            synchronized (obj2) {
                System.out.println(obj1 + " " + obj2);
            }
        }
    }

    public static boolean isLockOrderNormal(final Solution solution, final Object o1, final Object o2) throws Exception {
        Thread t1 = new Thread(() -> {
            synchronized (o1) {
                try {
                    Thread.sleep(1500);
                }
                catch (Exception e){

                }
                synchronized (o2) {
                    System.out.println("o1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            solution.someMethodWithSynchronizedBlocks(o1, o2);
        });
        //do something here
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();
        Thread.sleep(2000);
        if (t2.getState()== Thread.State.BLOCKED)
            return false;
        else return true;
    }

    public static void main(String[] args) throws Exception {
        final Solution solution = new Solution();
        final Object o1 = new Object();
        final Object o2 = new Object();

        System.out.println(isLockOrderNormal(solution, o1, o2));
    }
}
