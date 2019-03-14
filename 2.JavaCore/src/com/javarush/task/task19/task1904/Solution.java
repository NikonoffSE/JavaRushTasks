package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {
    //    String temp = "Иванов Иван Иванович 31 12 1950";
      //  String[] st = temp.split(" ");
    //    Date db = new Date(st[4] + "//" + st[3] + "//" + st[5]);
      //  System.out.println(st[0] + st[1] + st[2] + db);
    }

    public static class PersonScannerAdapter implements  PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String temp = fileScanner.nextLine();
            String[] st = temp.split(" ");
            Date db = new Date(st[4] + "//" + st[3] + "//" + st[5]);
            Person p = new Person(st[1], st[2], st[0], db);
            return p;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
