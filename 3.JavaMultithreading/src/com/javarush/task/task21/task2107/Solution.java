package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Solution sol = new Solution();
        sol.users = new LinkedHashMap<>();
        for (Map.Entry<String, User> u : this.users.entrySet()) {
            sol.users.put(new String((String) u.getKey()) , (User) u.getValue().clone());
        }

        return sol;
    }

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            User us = new User(this.age, this.name);
            return us;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj==null || this.getClass()!=obj.getClass()) return false;
            User s = (User) obj;
            return (age==s.age)&&(name==s.name || name!=null && name.equals(s.name));
        }
    }
}
