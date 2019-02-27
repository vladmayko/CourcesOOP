package com.gmail.hometask;

public class Circle extends Shape{
    private Point centre;
    private Point pointOnCircle;


    public Circle(Point centre, Point pointOnCircle) {
        this.centre = centre;
        this.pointOnCircle = pointOnCircle;
    }

    public Circle() {
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public Point getPointOnCircle() {
        return pointOnCircle;
    }

    public void setPointOnCircle(Point pointOnCircle) {
        this.pointOnCircle = pointOnCircle;
    }

    @Override
    public double getPerimetr(){
        double res = Math.PI * 2 * centre.distanceBetweenPoints(pointOnCircle);
        return Math.round(res * 100)/ 100.0d;

    }

    @Override
    public double getArea(){
        double res = Math.PI *  Math.pow(centre.distanceBetweenPoints(pointOnCircle), 2);
        return Math.round(res * 100)/ 100.0d;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "perimetr = " + getPerimetr() +
                ", area = " + getArea() +
                '}';
    }
}
