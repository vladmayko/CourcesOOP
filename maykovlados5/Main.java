package com.gmail.maykovlados5;


public class Main {
    public static void main(String[] args) {
        Network network = new Network("operator");
        Phone phoneOne = new Phone("0955825742", "iPhone 6", "10589953729");
        System.out.println(phoneOne);
        phoneOne.outсoingCall(network,"9674545883");
        System.out.println();

        Phone phoneTwo = new Phone("0677875464", "iPhone X", "105884628569");
        phoneTwo.registration(network);
        System.out.println(phoneTwo);
        phoneOne.outсoingCall(network, "0677875464");
        System.out.println();

        phoneTwo.outсoingCall(network, "0955825742");
        System.out.println();

        phoneOne.registration(network);
        phoneOne.outсoingCall(network, "0677875464");
        System.out.println();

        phoneOne.outсoingCall(network, "09763646434");
    }
}
