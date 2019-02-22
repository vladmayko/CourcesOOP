package com.gmail.maykovlados5;


public class Main {
    public static void main(String[] args) {
        Network network = new Network("operator");
        Phone phoneOne = new Phone("0955825742", "iPhone 6", "10589953729");
        System.out.println(phoneOne);
        phoneOne.outgoingCall(network,"9674545883");
        System.out.println();

        Phone phoneTwo = new Phone("0677875464", "iPhone 15", "105884628569");
        phoneTwo.registration(network);
        System.out.println(phoneTwo);
        phoneOne.outgoingCall(network, "0677875464");
        phoneTwo.outgoingCall(network, "0955825742");
        System.out.println();

        phoneOne.registration(network);
        phoneOne.outgoingCall(network, "0677875464");
        System.out.println();

        phoneOne.outgoingCall(network, "09763646434");
    }
}
