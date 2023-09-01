package com.github.UlrikeWerner.ArrayList;

import java.util.Objects;

public class Student {
    protected int matriculationNumber;
    protected String firstName;
    protected String lastName;

    public Student(){}
    public Student(int matriculationNumber, String firstName, String lastName){
        this.matriculationNumber = matriculationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matriculationNumber=" + matriculationNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matriculationNumber == student.matriculationNumber && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matriculationNumber, firstName, lastName);
    }
}
