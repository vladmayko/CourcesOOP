package com.gmail.hometask3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by MacUser on 25.02.19.
 */
public class Group{
    private Student[] students = new Student[10];

    public Group(Student[] students) {
        this.students = students;
    }

    public Group() {
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) throws GroupIsFullExeption{
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
        if(students != null) throw new GroupIsFullExeption();
    }

    public void delStudent(int numberOfRecordBook){
        for (int i = 0; i < students.length; i++) {
            if (students[i].getNumberOfRecordBook() == (numberOfRecordBook)){
                students[i] = null;
            }
        }
    }

    public Student searchOfStudent(String surName){
        for (int i = 0; i < students.length; i++) {
            if (students[i].getSurname().equals(surName)){
                return students[i];
            }
        }
        return null;
    }

    public void sort(){
        Comparator<Student> c = new Comparator<Student>() {
            public int compare(Student i1, Student i2) {
                if(i1 == null && i2 == null)
                    return 0;
                if(i2 == null)
                    return -1;
                if(i1 == null)
                    return 1;
                if(i1.getSurname() == null && i2.getSurname() == null)
                    return 0;
                if(i2.getSurname() == null)
                    return 1;
                if(i1.getSurname() == null)
                    return -1;
                return i1.getSurname().compareTo(i2.getSurname());
            }
        };
        Arrays.sort(students, c);
    }

    @Override
    public String toString() {
        sort();
        System.out.println("Group{");
        for (Student s: students) {
            System.out.println(s);
        }
        return "}";

    }
}
