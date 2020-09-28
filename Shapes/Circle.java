package com.sda.Shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(){
        radius = 1;
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

     public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(getRadius(),2);
        return area;
    }

    public double getPerimeter(){
        double perimeter = Math.PI * 2 * getRadius();
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle with color of " + color + " " + isFilledText() + ", with radius " + getRadius() + " is subclass of Shape. It has area of: " + getArea() + " and permimeter: " + getPerimeter();
    }
}
