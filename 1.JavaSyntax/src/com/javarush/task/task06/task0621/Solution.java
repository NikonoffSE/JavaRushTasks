package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gfatherName = reader.readLine();
        Cat catGFather = new Cat(gfatherName);

        String gmotherName = reader.readLine();
        Cat catGMother = new Cat(gmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);


        System.out.println(catGFather);
        System.out.println(catGMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
            //this.father = "no father";
            //this.mother = "no mother";
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            if (mother!=null)
            this.mother = mother;
            if (father!=null)
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father";
            else {
                if (father == null)
                    return "The cat's name is " + name + ", mother is " + mother.name  + ", no father";
                else {
                    if (mother == null)
                        return "The cat's name is " + name + ", no mother, father is " + father.name;
                    else
                        return "The cat's name is " + name + ", mother is " + mother.name  + ", father is " + father.name;

                }
            }

        }
    }

}
