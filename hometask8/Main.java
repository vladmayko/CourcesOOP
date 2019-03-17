package hometask8;

import java.util.Scanner;

/**
 * Created by MacUser on 10.03.19.
 */
public class Main {
    public static void main(String[] args) {
        BlackList bl = new BlackList();
        bl.addClassToBlackList(Double.class);
        Stack stack = new Stack(bl);

        stack.push(6);
        stack.push("String");
        System.out.println(stack.toString());

        stack.push(3.8);
        stack.push(true);

        Scanner scanner = new Scanner(System.in);

        stack.push(scanner);
        stack.push('r');
        System.out.println(stack.toString());

        stack.push(1);
        System.out.println(stack.toString());

        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        System.out.println(stack.toString());
        System.out.println(stack.peek());


        bl.addClassToBlackList(Integer.class);

        stack.push(9);
        System.out.println(bl.toString());
    }
}
