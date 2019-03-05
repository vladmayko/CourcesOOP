package hometask4;

import java.util.Objects;

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
                ", numberOfRecordBook = " + numberOfRecordBook + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return numberOfRecordBook == student.numberOfRecordBook
                && (getSurname() == student.getSurname()
                    ||(getSurname() != null && getSurname().equals(student.getSurname()))) && (getName() == student.getName()
                    ||(getName() != null && getName().equals(student.getName()) && (getSex() == student.getSex()
                    ||(getSex() != null && getSex().equals(student.getSex()) && (getAge() == student.getAge()
                    ||(getAge() !=0 && getAge() == student.getAge())
        )))));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int res = 1;
        res = prime * res + ((getSurname() == null) ? 0 : getSurname().hashCode());
        res = prime * res + ((getName() == null) ? 0 : getName().hashCode());
        res = prime * res + ((getSex() == null) ? 0 : getSex().hashCode());
        res = prime * res + getAge();
        res = prime * res + getNumberOfRecordBook();
        return res;
    }
}
