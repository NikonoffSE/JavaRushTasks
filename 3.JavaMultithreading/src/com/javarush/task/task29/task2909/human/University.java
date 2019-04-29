package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University  {

    protected int age;
    protected String name;
    private List<Student> students;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
        this.students = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudentWithAverageGrade(double value) {
        for (Student s : students) {
            if (s.getAverageGrade() == value)
                return s;
        }//TODO:
        return null;
    }


    public Student getStudentWithMaxAverageGrade() {

        Student student = null;
        double value = 0.0;
        for (Student s : students) {
            if (Double.compare(s.getAverageGrade(), value) == 1) {
                value = s.getAverageGrade();
                student = s;
            }
        }//TODO:
        return student;
    }

    public Student getStudentWithMinAverageGrade() {

        //return Collections.max(students, ((o1, o2) -> Double.compare(o1.getAverageGrade(),o2.getAverageGrade())));
        Student student = null;
        double value = 100.0;
        for (Student s : students) {
            if (Double.compare(s.getAverageGrade(), value) == -1) {
                value = s.getAverageGrade();
                student = s;
            }
        }
        return student;
    }

    public void expel(Student student) {
        students.remove(student);
    }
}