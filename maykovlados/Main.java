package com.gmail.maykovlados;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Car carOne = new Car();
//        carOne.color = "Green";
//        carOne.weight = 2000;
//        carOne.year = 1981;
        carOne.setColor("Green");
        carOne.setYear(1883);
        carOne.setWeight(2000);


        Car carTwo = new Car("Black", 1680, 1997);


        System.out.println(carOne);
        System.out.println(carTwo);



    }
}
