package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            A a = new A(getI(), getJ());
            return super.clone();
        }

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || this.getClass() != obj.getClass()) return false;
            A s = (A) obj;
            return (this.getI() == s.getI() && this.getJ() == s.getJ());
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }

        public String getName() {
            return name;
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return new C(getI(), getJ(), getName());
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || this.getClass() != obj.getClass()) return false;
            C s = (C) obj;
            return (this.getI() == s.getI() && this.getJ() == s.getJ()) && (this.getName() == s.getName() || (getName() != null && getName().equals(s.getName())));
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        A a1 = new A(1, 2);
        A a2 = (A) a1.clone();
        B b1 = new B(1, 2, " Jopa");
        //B b2  = (B) b1.clone();
        C c1 = new C(1, 2, "NotAZhopa");
        C c2 = (C) c1.clone();

    }
}
