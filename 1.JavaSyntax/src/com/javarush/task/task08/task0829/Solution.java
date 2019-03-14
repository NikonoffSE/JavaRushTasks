package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        List<String> addresses = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        // Read the house number
        String city = reader.readLine();
        for (int i = 0; i < addresses.size()-1; i+=2) {
            if (addresses.get(i).equals(city)) {
                System.out.println(addresses.get(i + 1));
                break;
            }
        }

    }
}
