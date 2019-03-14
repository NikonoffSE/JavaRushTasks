package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg z1 = new Zerg();
        Zerg z2 = new Zerg();
        Zerg z3 = new Zerg();
        Zerg z4 = new Zerg();
        Zerg z5 = new Zerg();
        z1.name = "Zizi";
        z2.name = "Zizu";
        z3.name = "Zazi";
        z4.name = "Zazu";
        z5.name = "Zuzi";
        Protoss p1 = new Protoss();
        p1.name = "Pororo";
        Protoss p2 = new Protoss();
        p2.name = "Pururu";
        Protoss p3 = new Protoss();
        p3.name = "Piriri";
        Terran t1 = new Terran();
        t1.name = "Terri";
        Terran t2 = new Terran();
        t2.name = "Turri";
        Terran t3 = new Terran();
        t3.name = "Tarri";
        Terran t4 = new Terran();
        t4.name = "Tirri";
        //напишите тут ваш код
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
