package com.gmail.hometask;

public class Triangle extends Shape{
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        double res = (a.distanceBetweenPoints(b) + b.distanceBetweenPoints(c)) + c.distanceBetweenPoints(a);
        return Math.round(res * 100)/ 100.0d;
    }

    @Override
    public double getArea() {
        double sideA = a.distanceBetweenPoints(b);
        double sideB = b.distanceBetweenPoints(c);
        double sideC = c.distanceBetweenPoints(a);
        double p = (sideA + sideB + sideC) / 2;
        double res = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return Math.round(res * 100)/ 100.0d;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "perimetr = " + getPerimetr() +
                ", area = " + getArea() +
                '}';
    }
}
