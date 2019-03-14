package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution{
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {





        SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);




        String name;
        Sex sex;
        Date bd;
       int id;
        if (args.length > 1) {

            switch (args[0]) {
                case ("-c"): {
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length-2; i+=3) {
                            name = args[i];
                            sex = (args[i + 1].equals("м") ? Sex.MALE : Sex.FEMALE);
                            try {
                                bd = sdf.parse(args[i + 2]);

                                if (sex == Sex.MALE) {
                                    allPeople.add(allPeople.size(), Person.createMale(name, bd));
                                } else
                                    allPeople.add(allPeople.size(), Person.createFemale(name, bd));
                            } catch (ParseException e) {
                            }
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;
                }
                case ("-u"): {
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length-1 ; i+=4) {
                            id = Integer.parseInt(args[i]);
                            allPeople.get(id).setName(args[i + 1]);
                            allPeople.get(id).setSex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
                            try {
                                bd = sdf.parse(args[i + 3]);
                                allPeople.get(id).setBirthDate(bd);
                            } catch (ParseException e) {
                            }
                        }
                    }
                    break;
                }
                case ("-d"): {
                    synchronized (allPeople) {
                        for (int i = 1; i < (args.length ); i++) {
                            id = Integer.parseInt(args[i]);
                            allPeople.get(id).setName(null);
                            allPeople.get(id).setSex(null);
                            allPeople.get(id).setBirthDate(null);
                        }
                    }
                    break;
                }
                case ("-i"): {
                    synchronized (allPeople) {
                        for (int i = 1; i < (args.length ); i++) {
                            id = Integer.parseInt(args[i]);
                            System.out.print(allPeople.get(id).getName() + " ");
                            System.out.print((allPeople.get(id).getSex() == Sex.MALE ? "м" : "ж") + " ");
                            System.out.println(sd.format(allPeople.get(id).getBirthDate()));
                        }
                    }
                    break;
                }
            }
        }

    }
}
