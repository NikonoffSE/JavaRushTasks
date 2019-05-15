package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth(){return 1;}
    public String getDescription(){return super.getDescription() + " Моя страна - " + Country.UKRAINE +". Я несу " + this.getCountOfEggsPerMonth() +  " яиц в месяц.";}
}
