package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;


    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Милка", 3, 0));
        game.getHorses().add(new Horse("Вилка", 3, 0));
        game.getHorses().add(new Horse("Пилка", 3, 0));
        game.run();
        game.printWinner();
    }

    public Horse getWinner() {
        Horse temp = new Horse("", 3, 0);
        for (Horse h: getHorses()) {
            if (h.getDistance()>temp.getDistance()){
                temp=h;
            }
        }
        return temp;
    }
    public void printWinner() {
        System.out.println( "Winner is " + getWinner().getName() + "!");
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {
        for (Horse h: getHorses()) {
            h.move();
        }
    }

    public void print() {
        for (Horse h: getHorses()) {
            h.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }
}
