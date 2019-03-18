package homework9.taskFour;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by MacUser on 18.03.19.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(12);
        System.out.println("The number of glasses drunk: " + n);
        quire(n);
    }

    public static void quire(int n){
        Queue<String> queue = new LinkedList<>();
        queue.offer("Sheldon");
        queue.offer("Leonard");
        queue.offer("Volovitc");
        queue.offer("Kutrapalli");
        queue.offer("Penny");
        System.out.println("Before: " + queue);

        for (int i = 0; i < n; i++) {
            String temp = queue.poll();
            queue.offer(temp);
            queue.offer(temp);
        }
        System.out.println("After: " + queue);
    }
}
