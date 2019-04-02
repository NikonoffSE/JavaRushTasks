package com.javarush.task.task21.task2108;

/* 
Клонирование растений
*/
public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone = (Tree)tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        System.out.println(clone.branches);
    }

    public static class Plant{
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable{
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            String[] s=new String[this.branches.length];
            for (int i = 0; i < branches.length; i++) {
                s[i]= new String(branches[i]);
            }
            Tree t= new Tree(new String(this.getName()), s);

            return t;
        }

        @Override
        public boolean equals(Object obj) {
            if (this==obj) return true;
            if (obj==null|| this.getClass()!=obj.getClass()) return false;
            Tree t = (Tree) obj;
            return this.getName()==t.getName()|| (getName()!=null&&getName().equals(t.getName()));
        }

        public String[] getBranches() {
            return branches;
        }
    }
}
