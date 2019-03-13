package hometask4;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by MacUser on 25.02.19.
 */
public class Start {

    public static void main(String[] args){
        Group group = new Group();
        try {
            group.addStudent(new Student("Mayko", "Vlad", 23, "man", 100000));
            group.addStudent(new Student("Grigorenko", "Anton", 22, "man", 100001));
            group.addStudent(new Student("Khirgii", "Artem", 20, "man", 100002));
            group.addStudent(new Student("Shestakova", "Victoria", 22, "woman", 100003));
            group.addStudent(new Student("Varava", "Nic", 23, "man", 100004));
            group.addStudent(new Student("Sydorenko", "Nikita", 18, "man", 100005));
            group.addStudent(new Student("Trygub", "Anton", 23, "man", 100006));
            group.addStudent(new Student("Mehed", "Vlad", 19, "man", 100007));
            group.addStudent(new Student("Nidelska", "Darya", 23, "woman", 100008));
            group.addStudent(new Student("Malikov", "Valera", 23, "man", 100009));
            group.addStudent(new Student("Ivanov", "Max", 23, "man", 100010));
        } catch (GroupIsFullException e){
            System.out.println("Group is full already!");
        }

        System.out.println(group + System.lineSeparator());

        group.delStudent(100001);

        System.out.println(group + System.lineSeparator());

        try {
            group.addStudent(new Student("Voroh", "Roman", 23, "man", 100011));
        } catch (GroupIsFullException e){
            System.out.println("Group is full already!");
        }

        System.out.println(group + System.lineSeparator());

        System.out.println(group.searchOfStudent("Mayko"));

        group.sortByParametr(CriteriumOfSorting.NAME);
        System.out.println(group + System.lineSeparator());

        try {
            group.addStudentInteractiv();
        } catch (GroupIsFullException e){
            System.out.println("Group is full already!");
        }catch (NumberFormatException e){

        }

        group.sortByParametr(CriteriumOfSorting.AGE);
        System.out.println(group + System.lineSeparator());

        System.out.println(Arrays.toString(group.guysOverEighteen()) + System.lineSeparator());

        File fileGroup = new File("group.txt");
        try {
            WriteRead.saveGroupToFile(fileGroup, group);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Group groupTest = null;
        try {
            groupTest = (Group) WriteRead.loadGroupFromFile(fileGroup);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(groupTest);
    }
}
