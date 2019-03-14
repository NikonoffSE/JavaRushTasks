package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    @Override
    public synchronized int compareTo(Beach o) {
        if (this.quality==o.quality && (Float.compare(this.distance, o.distance)==0)  || this.equals(o)) return 0;
       else {
            float g = this.distance*this.quality-o.getDistance()*o.getQuality();
            return (int)g;
       }
    }

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach b1 = new Beach("p1", 2.856458f, 2);
        Beach b2 = new Beach("p1", 3.142558f, 3);
        System.out.println(b1.compareTo(b2));
        System.out.println(b2.compareTo(b1));
    }
}
