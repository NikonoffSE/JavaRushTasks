package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("c:/Temp/your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            User u = new User();
            u.setFirstName("Vasya");
            u.setLastName("Pupkin");
            u.setMale(true);
            u.setCountry(User.Country.RUSSIA);
            u.setBirthDate(new Date());
            javaRush.users.add(u);//initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
          /*  System.out.println(javaRush.users.get(0).getFirstName());
            System.out.println(loadedObject.users.get(0).getFirstName());
            System.out.println(javaRush.users.get(0).getLastName());
            System.out.println(loadedObject.users.get(0).getLastName());
            System.out.println(javaRush.users.get(0).getCountry().getDisplayName());
            System.out.println(loadedObject.users.get(0).getCountry().getDisplayName());
            System.out.println(javaRush.users.get(0).getBirthDate().toString());
            System.out.println(loadedObject.users.get(0).getBirthDate().toString());
            System.out.println(javaRush.users.get(0).isMale());
            System.out.println(loadedObject.users.get(0).isMale());
*/

            System.out.println(javaRush.equals(loadedObject));
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            BufferedWriter bu = new BufferedWriter(new OutputStreamWriter(outputStream));
            if (this.users != null) {
                bu.write("users");
                bu.newLine();
                for (User u : users) {
                    bu.write(u.getFirstName());
                    bu.newLine();
                    bu.write(u.getLastName());
                    bu.newLine();
                    bu.write(String.valueOf(u.getBirthDate().getTime()));
                    bu.newLine();
                 // System.out.println(u.getCountry().getDisplayName());
                    bu.write(u.getCountry().getDisplayName());
                    bu.newLine();
                    bu.write(String.valueOf(u.isMale()));
                    bu.newLine();
                }
            } else
                bu.write("null");
            bu.close();
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            if (br.readLine().equals("users")) {
                while (br.ready()) {
                    User u = new User();
                    u.setFirstName(br.readLine());
                    u.setLastName(br.readLine());
                    Date d = new Date();
                    d.setTime(Long.valueOf(br.readLine()));
                    u.setBirthDate(d);
                    User.Country c;
                    String s;
                    if((s=br.readLine()).equals("Russia"))
                        c=User.Country.RUSSIA;
                    else{
                        if (s.equals("Ukraine")){
                            c= User.Country.UKRAINE;
                        }
                        else c= User.Country.OTHER;
                    }
                    u.setCountry(c);
                    u.setMale(Boolean.valueOf(br.readLine()));
                    users.add(u);
                }
                br.close();
            }
            //implement this method - реализуйте этот метод
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
