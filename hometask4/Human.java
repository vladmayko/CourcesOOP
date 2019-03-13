package hometask4;

import java.io.Serializable;

/**
 * Created by MacUser on 25.02.19.
 */
public class Human implements Serializable{
    private static final long serialVersionUID = 1L;
    private String surname;
    private String name;
    private int age;
    private String sex;

    public Human() {
    }

    public Human(String surname, String name, int age, String sex) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "surname = " + surname  +
                ", name = " + name  +
                ", age = " + age +
                ", sex = " + sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (surname != null ? !surname.equals(human.surname) : human.surname != null) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        return sex != null ? sex.equals(human.sex) : human.sex == null;
    }

    @Override
    public int hashCode() {
        int result = surname != null ? surname.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }
}
