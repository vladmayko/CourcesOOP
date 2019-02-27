package com.gmail.hometask;

public class Square extends Shape{
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square() {
    }

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;

        this.b = b;
        this.c = c;
        this.d = d;
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public double getPerimetr() {
        double res = (a.distanceBetweenPoints(b) + b.distanceBetweenPoints(c)) * 2;
       return Math.round(res * 100)/ 100.0d;
    }

    @Override
    public double getArea() {
        double res = a.distanceBetweenPoints(b) * b.distanceBetweenPoints(c);
        return Math.round(res * 100)/ 100.0d;
    }

    @Override
    public String toString() {
        return "Square{"+
                "perimetr = " + getPerimetr() +
                ", area = " + getArea() +
                '}';
    }
}
