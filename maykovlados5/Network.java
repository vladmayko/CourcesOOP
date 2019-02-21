package com.gmail.maykovlados5;


import java.util.HashSet;
import java.util.Set;

public class Network {
    private static Set<String> validNumbers = new HashSet<>();

    public static Set<String> getValidNumbers() {
        return validNumbers;
    }

    public static void setValidNumbers(Set<String> validNumbers) {
        Network.validNumbers = validNumbers;
    }

    public static void addNumber(String number){
        validNumbers.add(number);
    }

    public static boolean findNumber(String number){
        return (validNumbers.contains(number)) ? true : false;
    }
}
