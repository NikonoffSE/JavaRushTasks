package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
      // String f = "15/04/1990";
        SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
       // try {
        //   Date d = sdf.parse(f);

       // System.out.println(sd.format(d));
       //}
      // catch (ParseException e) {}
//try {
    String name;
    Sex sex;
    Date bd;
    int id;
    String key = "";
    if (args.length > 0) {
        key = args[0];
        if (key.equals("-c")) {
            name = args[1];
            sex = (args[2].equals("м") ? Sex.MALE : Sex.FEMALE);
            //bd = new Date(args[3]);
            try {
                bd = sdf.parse(args[3]);

                if (sex == Sex.MALE) {
                    allPeople.add(allPeople.size(), Person.createMale(name, bd));
                } else
                    allPeople.add(allPeople.size(), Person.createFemale(name, bd));
            } catch (ParseException e) {
            }
            System.out.println(allPeople.size() - 1);
            //конец добавления
        } else {
            id = Integer.parseInt(args[1]);
            if (key.equals("-u")) {
                allPeople.get(id).setName(args[2]);
                allPeople.get(id).setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                try {
                    bd = sdf.parse(args[4]);
                    allPeople.get(id).setBirthDate(bd);
                } catch (ParseException e) {
                }
                //конец апдейта
            } else if (key.equals("-d")) {
                allPeople.get(id).setName(null);
                allPeople.get(id).setSex(null);
                allPeople.get(id).setBirthDate(null);
            } else if (key.equals("-i")) {
                System.out.print(allPeople.get(id).getName() + " ");
                System.out.print((allPeople.get(id).getSex() == Sex.MALE ? "м" : "ж") + " ");
                System.out.print(sd.format(allPeople.get(id).getBirthDate()));
            }


        }
    }

//}
//  catch (ArrayIndexOutOfBoundsException e){
//      e.printStackTrace();
//  }

        //start here - начни тут
    }
}
