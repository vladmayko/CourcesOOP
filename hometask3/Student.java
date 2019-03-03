package com.gmail.hometask3;

/**
 * Created by MacUser on 25.02.19.
 */
public class Student extends Human{
    private int numberOfRecordBook;

    public Student(String surname, String name, int age, String sex, int numberOfRecordBook) {
        super(surname, name, age, sex);
        this.numberOfRecordBook = numberOfRecordBook;
    }

    public Student() {
    }

    public int getNumberOfRecordBook() {
        return numberOfRecordBook;
    }

    public void setNumberOfRecordBook(int numberOfRecordBook) {
        this.numberOfRecordBook = numberOfRecordBook;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() +
                ", numberOfRecordBook=" + numberOfRecordBook + "]";
    }
}
