package homework9.taskOne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MacUser on 18.03.19.
 */
public class Main {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
        System.out.println("Before: " + list);
        list.remove(0);
        list.remove(0);
        list.remove(list.size() - 1);
        System.out.println("After: " + list);
    }
}
