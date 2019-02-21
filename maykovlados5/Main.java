package com.gmail.maykovlados5;


public class Main {
    public static void main(String[] args) {
        Phone phoneOne = new Phone("0955825742", "iPhone 6", "10589953729");
        System.out.println(phoneOne);
        phoneOne.callTo("9674545883");
        System.out.println();

        Phone phoneTwo = new Phone();
        phoneTwo.setPhoneNumber("0677875464");
        phoneTwo.registration();
        System.out.println(phoneTwo);
        phoneOne.callTo(phoneTwo.getPhoneNumber());
        System.out.println();

        phoneOne.registration();
        System.out.println(phoneOne);
        phoneOne.callTo(phoneTwo.getPhoneNumber());
        System.out.println();

        phoneOne.callTo("09763646434");
    }
}
