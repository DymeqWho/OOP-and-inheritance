package com.sda.abstract3dClass;

public class Cubic extends Shape3d {

    private final int side;

    public Cubic(int side) {
        super("Cube");
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    @Override
    public double calculatePeremiter() {
        return 12 * side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }
}
