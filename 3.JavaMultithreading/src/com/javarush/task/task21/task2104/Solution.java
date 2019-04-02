package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;
        Solution solution = (Solution) o;
        return (first==solution.first ||(first!=null && first.equals(solution.first)))&&
                ((last==solution.last || last!=null && last.equals(solution.last)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    /*  public boolean equals(Solution n) {
                if (n==this) return true;
                if (n.getClass()!=Solution.class)  return false;
                if (n==null || this.getClass()!= n.getClass()) return false;
                return (first==n.first ||(first!=null && n.first.equals(first))) &&(last==n.last || (last!=null && n.last.equals(last)));
            }

            public int hashCode() {
                return first.hashCode() + last.hashCode();
            }
        */
    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
