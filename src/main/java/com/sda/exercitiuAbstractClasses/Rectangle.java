package com.sda.exercitiuAbstractClasses;

public class Rectangle extends AShape {

    private double bigSide;
    private double smallSide;

    public Rectangle(double bigSide, double smallSide){
        this.bigSide = bigSide;
        this.smallSide = smallSide;
    }

    public double getBigSide() {
        return bigSide;
    }

    public double getSmallSide() {
        return smallSide;
    }

    @Override
    public double getArea() {
        return smallSide*bigSide;
    }

    @Override
    public double getPerimeter() {
        return smallSide*2+bigSide*2;
    }
}
