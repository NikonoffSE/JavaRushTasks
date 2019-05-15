package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread sp1 = new SpecialThread();
        sp1.run();
        list.add(new Thread(sp1));
        SpecialThread sp2 = new SpecialThread();
        sp2.run();
        list.add(new Thread(sp2));
        SpecialThread sp3 = new SpecialThread();
        sp3.run();
        list.add(new Thread(sp3));
        SpecialThread sp4 = new SpecialThread();
        sp4.run();
        list.add(new Thread(sp4));
        SpecialThread sp5 = new SpecialThread();
        sp5.run();
        list.add(new Thread(sp5));

/*        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.get(0).start();
        list.get(1).start();
        list.get(2).start();
        list.get(3).start();
        list.get(4).start();
*/
        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
