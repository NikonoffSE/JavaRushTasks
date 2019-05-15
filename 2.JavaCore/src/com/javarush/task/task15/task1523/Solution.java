package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public int i;
    public String s;
    public boolean b;

    public static void main(String[] args) {

    }
    private  Solution(String s) {
    }
    protected Solution(String s, int i, boolean b) {
    }
     Solution(String s, int i) {
    }

    public Solution() {
    }
 }

