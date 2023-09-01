package com.github.UlrikeWerner.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    protected List<Student> studentList = new ArrayList<>();

    public School(){}
    public School(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
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
        studentList.add(student);
    }
    public void deleteStudent(int matriculationNumber){
        studentList.remove(findStudentById(matriculationNumber));
    }
    public void deleteStudent(Student student){
        studentList.remove(student);
    }
    public Student findStudentById(int matriculationNumber){
        for (Student student : studentList){
            if(student.getMatriculationNumber() ==  matriculationNumber){
                return student;
            }
        }
        return null;
    }
    public List<Course> findCoursesByStudentId(int matriculationNumber){
        for (Student student : studentList){
            if(student.getMatriculationNumber() ==  matriculationNumber){
                return student.getCourseList();
            }
        }
        return null;
    }
}
