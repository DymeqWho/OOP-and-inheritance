package com.sda.interfaceEx3;

public class Kwadrat implements Shape {

    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    @Override
    public double calculateArea() {
        return bok * bok;
    }
}
