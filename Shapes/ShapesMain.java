package com.sda.Shapes;

public class ShapesMain {
    public static void main(String[] args) {

        Circle circle1 = new Circle("unknown", false, 1);

        System.out.println(circle1.toString());

        Rectangle rectangle1 = new Rectangle("unknown", false, 1, 1);
        rectangle1.setColor("blue");
        rectangle1.setFilled(true);
        rectangle1.setLength(10);
        rectangle1.setWidth(5);
        System.out.println(rectangle1.toString());



    }
}
