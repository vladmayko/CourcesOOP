package com.gmail.maykovlados3;


public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3,4, 5);
        System.out.println(t1);
        System.out.println("Square = " + t1.square());

        t1.setB(6);
        System.out.println(t1);
        System.out.println("Square = " + String.format("%.2f", t1.square()));

        t1.setC(10);
        System.out.println(t1);
        System.out.println("Square = " + t1.square());
    }
}
