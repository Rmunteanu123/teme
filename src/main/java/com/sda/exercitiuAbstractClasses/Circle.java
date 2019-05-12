package com.sda.exercitiuAbstractClasses;

public class Circle extends AShape{

    public static final double PI = 3.14;
    //Math.PI

    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
      //return Math.PI * radius * radius
        return PI*radius * radius;
    }

    public double getPerimeter() {
        // return 2*Math.PI*radius
        return 2*PI*radius;
    }


}
