package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    private static ArrayList<Integer> open = new ArrayList<>();
    private static ArrayList<Integer> close = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));  // создали входящий поток
        BufferedReader bout = new BufferedReader(new FileReader(bin.readLine())); // создали поток чтения
        bin.close();  //закрыли входящий поток
        String s = "";
        while (bout.ready())
            s = s + bout.readLine(); // заполнили строку из файла
        bout.close();  //закрыли поток из файла
     //   s = s.replace("<" + args[0] , "<" + args[0] + " ");        // эти три строки -
       // s = s.replace("<" + args[0] + "  ", "<" + args[0] + " ");  // добавляют пробел в последнюю пару тегов
        //s = s.replace("<" + args[0]+ " >", "<" + args[0] + ">");   // с переносом, валидатор ен пускал и так
        Pattern pat = Pattern.compile("<" + args[0]);
        Matcher m = pat.matcher(s);
        while (m.find()) {
            open.add(m.start());  //заполняем массив первых координат открывающих тегов
          //  System.out.println(m.start());
        }
        Pattern pat1 = Pattern.compile("</" + args[0] + ">");
        Matcher m1 = pat1.matcher(s);
        while (m1.find()) {
            close.add(m1.end()); //заполняем массив первых координат закрывающих тегов
           // System.out.println(m1.end());
        }
        while (true) {
            if (open.size() > 0) {
                print(0, 0, s, 0);
            } else break;

        }
    }

    private static void print(int o, int c, String s, int m) {
        int n=m;
        //System.out.println("1"+" "+ open.get(o) + " "  +close.get(c));
        if (o==open.size()-1 || open.size() == o + n + 1) {
           // System.out.println("2"+" "+ open.get(o) + " "  +close.get(c));
            System.out.println(s.substring(open.get(o), close.get(c)));
            open.remove(o);
            close.remove(c);
        }
        else {
            //System.out.println("3"+" "+ open.get(o) + " "  +close.get(c));
            if ( open.get(o+1+n)>=close.get(c)){
              //  System.out.println("4"+" "+ open.get(o) + " "  +close.get(c));
                System.out.println(s.substring(open.get(o), close.get(c)));
                open.remove(o);
                close.remove(c);

            }
            else {
                if (open.get(o+1)<close.get(c)){
                  //  System.out.println("5"+" "+ open.get(o) + " "  +close.get(c));
                    n++;
                    print(o, c + 1, s, n);
                }
            }
        }
    }
}
