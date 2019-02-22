package com.gmail.maykovlados2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cat myCat = new Cat("Tom", "British shorthair", "Grey", 3.3,2);

        myCat.setWeigh(3.5);

        System.out.println(myCat);

        myCat.foodRequest();

        Scanner myScan = new Scanner(System.in);
        System.out.println("Do you want to feed a cat? Yes - 1, No - 0");
        int i = myScan.nextInt();
        while (i == 1){
            System.out.println("How much a food(kg) give to cat?");
            double w = myScan.nextDouble();
            myCat.toFeed(w);
            System.out.println("Do you want to feed a cat again? Yes - 1, No - 0");
            i = myScan.nextInt();
        }
    }
}
