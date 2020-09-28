package com.sda.interfaceEx1;

public class Animal implements Dummy, Moveable, Screemable { //implementujemy interfejs za pomocą implements


    @Override
    public double getSpeed() {
        return 11.5; //np 11,5
    }

    @Override
    public void screem() {
        System.out.println("I do not screem...");
    }

    @Override
    public void speek() {
        System.out.println("AAAAAAAAAAAAAAAAA!");

    }
}
