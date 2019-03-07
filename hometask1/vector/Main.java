package com.gmail.maykovlados4;


public class Main {
    public static void main(String[] args) {
        Vector3d vector1 = new Vector3d(8, 3, 9);
        Vector3d vector2 = new Vector3d(0,5,3);
        System.out.println(vector1 + " " + vector2);
        vector2.z =100;
        System.out.println(vector1.vectorSummary(vector1, vector2));

        System.out.println(vector1.scalarMultiplication(vector1,vector2));

        System.out.println(vector1.vectorMultiplication(vector1,vector2));
    }
}
