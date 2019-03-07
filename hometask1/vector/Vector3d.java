package com.gmail.maykovlados4;

public class Vector3d {
    private double x;
    private double y;
    public double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector3d vectorSummary(Vector3d vectorOne, Vector3d vectorTwo){
        double newX = vectorOne.x +vectorTwo.x;
        double newY = vectorOne.y +vectorTwo.y;
        double newZ = vectorOne.z +vectorTwo.z;
        return new Vector3d(newX, newY, newZ);
    }

    public double scalarMultiplication(Vector3d vectorOne, Vector3d vectorTwo) {
        return vectorOne.x * vectorTwo.x + vectorOne.y * vectorTwo.y + vectorOne.z * vectorTwo.z;
    }

    public Vector3d vectorMultiplication(Vector3d vectorOne, Vector3d vectorTwo){
        double newX = vectorOne.y * vectorTwo.z - vectorOne.z * vectorTwo.y;
        double newY = vectorOne.z * vectorTwo.x - vectorOne.x * vectorTwo.z;
        double newZ = vectorOne.x * vectorTwo.y - vectorOne.y * vectorTwo.x;
        return new Vector3d(newX, newY, newZ);
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
