package com.gmail.maykovlados2;

public class Cat {
    private String name;
    private String breed;
    private String color;
    private double weigh;
    private int age;
    private double w = 0;

    Cat(String name, String breed, String color, double weigh, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.weigh = weigh;
        this.age = age;
    }

    Cat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void foodRequest() {
        System.out.println("MEEEEEEOW!!!!");
    }

    public void toFeed(double w){
        this.w += w;
        if(this.w < weigh * 0.08){
            System.out.println("I would eat more ;)");
        } else if (this.w >= weigh * 0.08 && this.w <= weigh * 0.1){
            System.out.println("I'm full");
            System.exit(0);
        }else if (this.w > weigh * 0.1) {
            System.out.println("I'm full, but not eaten all");
            System.exit(0);
        }
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", weigh=" + weigh +
                ", age=" + age +
                '}';
    }
}
