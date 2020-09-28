package com.sda.abstract3dClass;

public class Square extends Shape{

    private final int side;

    public Square(int side){
        super("Kwadrat");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePeremiter() {
        return 4*side;
    }
}
