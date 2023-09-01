package com.github.UlrikeWerner.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    protected List<Object> studentList = new ArrayList<>();

    public School(){}
    public School(List<Object> studentList) {
        this.studentList = studentList;
    }

    public List<Object> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Object> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "School{" +
                "studentList=" + studentList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(studentList, school.studentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentList);
    }

    public void addStudent(Object student){
        studentList.add(student);
    }
}
