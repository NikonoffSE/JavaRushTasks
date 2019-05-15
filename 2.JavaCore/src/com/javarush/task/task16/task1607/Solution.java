package com.javarush.task.task16.task1607;

import java.util.ArrayList;
import java.util.List;

/* 
Horse Racing
*/

public class Solution {
    public static int horseCount = 10;

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart();
        while (calculateHorsesFinished(horses) != horseCount) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        for (int i = 0; i < horses.size(); i++) {
            if (!horses.get(i).isFinished()) {
                System.out.println("Waiting for " + horses.get(i).getName());
                horses.get(i).join();

            }
            else if(horses.get(i).isFinished()) {
                //System.out.println(horses.get(i).getName() + " has finished the race!");
                finishedCount = finishedCount + 1; //finishedCount++;
               // System.out.println(finishedCount);
            }

            }






        // while (finishedCount<10){
        /*for (Horse horse: horses) {
            if (horse.isFinished()==false) {
                System.out.println("Waiting for " + horse.getName());
                horse.join();

               // horse.

            } else {
                System.out.println(horse.getName() + " has finished the race!");
                finishedCount = finishedCount + 1; //finishedCount++;
                //System.out.println(horse.getName() + " has finished the race!");
            }
            System.out.println(finishedCount);
//return finishedCount;
        }*/
       // }
        //add your implementation here - добавь свою реалзацию тут
        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart() {
        List<Horse> horses = new ArrayList<Horse>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }

    public static class Horse extends Thread {

        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return isFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   //delay
                s += "" + i;
                if (i == 1000) {
                    s = " has finished the race!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}
