package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = bufferedReader.readLine();
        String f2 = bufferedReader.readLine();
        bufferedReader.close();
       //BufferedReader bf1= new BufferedReader(new FileReader("c:/temp/1.txt"));
        BufferedReader bf1= new BufferedReader(new FileReader(f1));
       //BufferedReader bf2= new BufferedReader(new FileReader("c:/temp/2.txt"));
        BufferedReader bf2= new BufferedReader(new FileReader(f2));
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        String buf="";
        while ((buf=bf1.readLine())!=null)
            s1.add(buf);
        while ((buf=bf2.readLine())!=null)
            s2.add(buf);
        bf1.close();
        bf2.close();
        //int l = s1.size()>s2.size()? s1.size(): s2.size();
        int i=0;
        int j=0;
        while (i<s1.size()||j<s2.size()){
           if (s1.get(i).equals(s2.get(j))) {
               lines.add(new LineItem(Type.SAME, s1.get(i)));
               i++;
               j++;
           }else {
               if (s1.get(i).equals(s2.get(j+1)) && !(s1.get(i).equals(s2.get(j)))){
                   lines.add(new LineItem(Type.ADDED, s2.get(j)));
                   lines.add(new LineItem(Type.SAME, s1.get(i)));
                   i++;
                   j = j + 2;
               }
               else {
                   lines.add(new LineItem(Type.REMOVED, s1.get(i)));
                   i++;
               }
           }
            if (i>=s1.size()&&(j>=s2.size())) {
                break;
            }
            if (i>=s1.size()){
                lines.add(new LineItem(Type.ADDED, s2.get(j)));
                break;
            }

            if (j>=s2.size()){
                lines.add(new LineItem(Type.REMOVED, s1.get(i)));
            break;
            }
        }

   //    for (LineItem l: lines) {
     //       System.out.println(l.type + " " + l.line);
       // }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
