package hometask4;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by MacUser on 25.02.19.
 */
public class Student extends Human implements Serializable{
    private static final long serialVersionUID = 1L;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return numberOfRecordBook == student.numberOfRecordBook;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfRecordBook;
        return result;
    }
}
