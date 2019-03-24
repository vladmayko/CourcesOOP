package hometask4;


import hometask4.Voencom;

import javax.swing.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by MacUser on 25.02.19.
 */
public class Group implements Voencom, Serializable{
    private static final long serialVersionUID = 1L;
    private List<Student> students = new ArrayList<>();

    public Group() {
    }

    public Group(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) throws GroupIsFullException {
        if (students.size() > 9) throw new GroupIsFullException();
        this.students = students;
    }

    public void addStudent(Student student) throws GroupIsFullException{
        if (student != null){
            if (this.students.size() > 9) {
                throw new GroupIsFullException();
            } else if (this.students.size() < 10){
                this.students.add(student);
            }
        }
    }

    public void delStudent(int numberOfRecordBook){
        for (Student s: new ArrayList<Student>(this.students)) {
            if (s.getNumberOfRecordBook() == numberOfRecordBook){
                this.students.remove(s);
            }
        }
    }

    public Student searchOfStudent(String surName) {
        for (Student s: students) {
            if(s.getSurname().equals(surName)){
                return s;
            }
        }
        return null;
    }

    public void addStudentInteractiv() throws  GroupIsFullException, NumberFormatException {
        if (this.students.size() > 9) {
            throw new GroupIsFullException();
        } else if (this.students.size() < 10) {
            String surname = String.valueOf(JOptionPane.showInputDialog("Input surname"));
            String name = String.valueOf(JOptionPane.showInputDialog("Input name"));
            int age = Integer.valueOf(JOptionPane.showInputDialog("Input age"));
            String sex = String.valueOf(JOptionPane.showInputDialog("Input sex"));
            int numberOfRecordBook = Integer.valueOf(JOptionPane.showInputDialog("Input number of record book"));
            Student student = new Student(surname, name, age, sex, numberOfRecordBook);
            this.students.add(student);
        }
    }

    public void surmameSort(){
        this.students.sort((a, b) -> a.getSurname().compareTo(b.getSurname()));
    }

    public void nameSort(){
        this.students.sort((a, b) -> a.getName().compareTo(b.getName()));
    }

    public void ageSort(){
        this.students.sort((a, b) -> a.getAge() - (b.getAge()));
    }

    public void sortByParametr(CriteriumOfSorting criterium){
        switch (criterium){
            case SURNAME: surmameSort();
                break;
            case NAME: nameSort();
                break;
            case AGE: ageSort();
                break;
        }
    }

    @Override
    public Student[] guysOverEighteen() {
        List <Student> sr = new ArrayList<>();
        for (Student s: students) {
            if (s.getAge() >= 18 && s.getSex().equals("man")){
                sr.add(s);
            }
        }
        Student[] studentsRecruit = new Student[sr.size()];
        for (int i = 0; i < sr.size(); i++) {
            studentsRecruit[i] = sr.get(i);
        }
        return studentsRecruit;
    }

    /**
     * Stream API, task 1
     */

    public List<Student> firstLetterSearching(char letter){
        List<Student> letterList = students.stream()
                .filter(s -> s.getSurname().indexOf(letter) == 0)
                .collect(Collectors.toCollection(ArrayList:: new));
        return letterList;
    }



    @Override
    public String toString() {
        System.out.println("Group{");
        for (Student s: students) {
            System.out.println(s);
        }
        return "}";
    }
}
