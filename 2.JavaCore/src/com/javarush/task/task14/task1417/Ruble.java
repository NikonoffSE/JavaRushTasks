package com.javarush.task.task14.task1417;

public class Ruble extends Money {
    private double amount;

    public Ruble(double amount) {
        super(amount);
        //his.amount = amount;
    }

    public String getCurrencyName(){
        return "RUB";
    }

   // @Override
    //public double getAmount() {
//        return this.amount;
//    }
}
