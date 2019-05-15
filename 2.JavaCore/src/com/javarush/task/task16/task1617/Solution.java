package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
       // if (clock.)
        clock.interrupt();
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                String s = "Марш!";
                //if (numSeconds == 3) s = "Марш!";
//                else s = "Прервано!";
                while (numSeconds > 0) {

                    System.out.print(numSeconds + " ");//add your code here - добавь код тут
                    Thread.sleep(1000);
                    numSeconds--;


                }
                System.out.println(s);
            } catch (InterruptedException e) {
                if (numSeconds>0)System.out.println("Прервано!");
            }
        }

    }
}
