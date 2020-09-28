package com.sda.abstract3dClass;

public class Circle extends Shape {

    private final int radius;

    public Circle(int radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculatePeremiter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
