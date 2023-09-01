package com.github.UlrikeWerner.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(526183, "Anna", "Müller"));
        studentList.add(new Student(526184, "Dieter", "Lehmann"));
        studentList.add(new Student(526185, "Otto", "Nielsen"));

        System.out.println(studentList.get(1));
    }
}
