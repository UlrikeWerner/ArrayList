package com.github.UlrikeWerner.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student526183 = new Student(526183, "Anna", "Müller");
        Student student526184 = new Student(526184, "Dieter", "Lehmann");
        Student student526185 = new Student(526185, "Otto", "Nielsen");

        studentList.add(student526183);
        studentList.add(student526184);
        studentList.add(student526185);
        System.out.println(studentList.get(1));
        System.out.println("-----------------------------");

        School gymnasium = new School();
        gymnasium.addStudent(student526183);
        gymnasium.addStudent(student526185);
        System.out.println(gymnasium);
    }
}
