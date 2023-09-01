package com.github.UlrikeWerner.ArrayList;

import java.util.*;

public class School {
    //protected List<Student> studentList = new ArrayList<>();
    private Map<Integer, Student> studentList = new HashMap<>();

    public School(){}

    public void setStudentList(Map<Integer, Student> studentList) {
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

    public void addStudent(Student student){
        studentList.put(student.getMatriculationNumber(), student);
    }
    public void deleteStudent(int matriculationNumber){
        studentList.remove(matriculationNumber);
    }

    public Student findStudentById(int matriculationNumber){
        return studentList.get(matriculationNumber);
    }
    public List<Course> findCoursesByStudentId(int matriculationNumber){
        return findStudentById(matriculationNumber).getCourseList();
    }
}
