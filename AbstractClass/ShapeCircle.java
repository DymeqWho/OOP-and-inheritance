package com.sda.AbstractClass;

public class ShapeCircle extends Shape{


    @Override //To zostało wymuszone do nadpisania z klasy Shape, która jest abstrakcyjna
    protected String getName() {
        return null;//albo cokolwiek, co jest Stringiem, niekoniecznie null :P
    }
}
