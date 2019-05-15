package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country == Country.RUSSIA) hen = new RussianHen();
            if (country == Country.BELARUS) hen = new BelarusianHen();
            if (country == Country.MOLDOVA) hen = new MoldovanHen();
            if (country == Country.UKRAINE) hen = new UkrainianHen();
            return hen;
        }
    }

    //public static class RussianHen extends Hen{
      //  public int getCountOfEggsPerMonth(){return 100;}
        //public String getDescription(){return super.getDescription() + " Моя страна - " + Country.RUSSIA +". Я несу " + this.getCountOfEggsPerMonth() +  " яиц в месяц.";}    }
    //public static class UkrainianHen extends Hen{
      //  public int getCountOfEggsPerMonth(){return 1;}
        //public String getDescription(){return super.getDescription() + " Моя страна - " + Country.UKRAINE +". Я несу " + this.getCountOfEggsPerMonth() +  " яиц в месяц.";}
    //    }
   // public static class MoldovanHen extends Hen{
     //   public int getCountOfEggsPerMonth(){return 50;}
       // public String getDescription(){return super.getDescription() + " Моя страна - " + Country.MOLDOVA +". Я несу " + this.getCountOfEggsPerMonth() +  " яиц в месяц.";}
    //}
    //public static class BelarusianHen extends Hen{
//        public int getCountOfEggsPerMonth(){return 60;}
  //      public String getDescription(){return super.getDescription() + " Моя страна - " + Country.BELARUS +". Я несу " + this.getCountOfEggsPerMonth() +  " яиц в месяц.";}}

}
