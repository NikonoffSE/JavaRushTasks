package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            s.add(reader.readLine());
        }
        for (int i = 0; i < M; i++) {
            s.add(s.get(i));
        }
        for (int i = M-1; i >= 0; i--) {
            s.remove(i);
        }
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }

        //напишите тут ваш код
    }
}
