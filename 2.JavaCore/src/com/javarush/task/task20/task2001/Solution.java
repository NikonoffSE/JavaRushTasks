package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            System.out.println(ivanov.equals(somePerson));//check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            BufferedWriter b = new BufferedWriter(new OutputStreamWriter(outputStream));
            if (this.name != null) {
                b.write(this.name);
                b.newLine();//implement this method - реализуйте этот метод
            } else {
                b.write("noname");
            }
            if (this.assets != null) {
                b.write("assets");
                b.newLine();
                for (Asset a : assets) {
                    b.write(a.getName());
                    b.newLine();
                    b.write(String.valueOf(a.getPrice()));
                    b.newLine();
                }

                //implement this method - реализуйте этот метод
            } else {
                b.write("noassets");
            }
            b.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String hname;
            String aname;

            if ((hname = br.readLine()).equals("noname")) {
                return;
            } else {
                this.name=hname;
                if ((aname=br.readLine()).equals("assets")){
                   while    (br.ready()){
                       this.assets.add(new Asset(br.readLine(), Double.parseDouble(br.readLine())));
                   }
                }

            }

            //implement this method - реализуйте этот метод
        }
    }
}