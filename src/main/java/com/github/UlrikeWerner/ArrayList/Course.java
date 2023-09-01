package com.github.UlrikeWerner.ArrayList;

import java.util.Objects;

public class Course {
    protected String courseName;
    protected String dozent;
    protected String room;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public Course(String courseName, String dozent) {
        this.courseName = courseName;
        this.dozent = dozent;
    }
    public Course(String courseName, String dozent, String room) {
        this.courseName = courseName;
        this.dozent = dozent;
        this.room = room;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDozent() {
        return dozent;
    }

    public void setDozent(String dozent) {
        this.dozent = dozent;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", dozent='" + dozent + '\'' +
                ", room='" + room + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseName, course.courseName) && Objects.equals(dozent, course.dozent) && Objects.equals(room, course.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, dozent, room);
    }
}
