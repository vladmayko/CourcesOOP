package hometask10.taskThree;

import java.util.HashMap;

/**
 * Created by MacUser on 28.03.19.
 */
public class RepeatingInArray {
    public static void main(String args[]){
        Integer[] arrayInt = {9, 0, 5, 88, 0, 2, 1, 10, 8, 0, 8, 10};
        String[] arrayStr = {"peek","pop","pop","push","del","clean","del","del"};
        System.out.println(repeatedElements(arrayInt));
        System.out.println(repeatedElements(arrayStr));
    }

    public static <T> HashMap<T,Integer> repeatedElements(T[] array){
        HashMap<T, Integer> listRepeater = new HashMap<>();
        for (T key:array) {
            listRepeater.put(key, (!listRepeater.containsKey(key) ? 1 : listRepeater.get(key) + 1));
        }
        return listRepeater;
    }
}
