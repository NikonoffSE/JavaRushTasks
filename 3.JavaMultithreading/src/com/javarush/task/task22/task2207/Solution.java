package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(bu.readLine())));
        bu.close();
        String s = "";
        while (fin.ready()) {
            s += fin.readLine() + " ";
        }
        String[] strings = s.split(" ");
        //System.out.println(strings.length);

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(strings[i]);
                // System.out.println(strings[i] + " " + sb.reverse().toString());
                if (i != j && strings[j].equals(sb.reverse().toString())) {
                    Pair p = new Pair();
                    p.first = strings[i];
                    p.second = strings[j];

                    if (!result.contains(p) && paircontains(p)) result.add(p);

                }
            }
        }
        for (Pair p : result) {
            System.out.println(p.first + " " + p.second);   // c:/Temp/1.txt
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

    public static boolean paircontains(Pair in) {
        for (Pair p:result) {
            //StringBuilder sb = new StringBuilder(p.first+p.second);
            if (in.first.equals(p.first) ||in.first.equals(p.second))
                return false;
        }
        return true;
    }
}
