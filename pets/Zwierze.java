package com.sda.pets;

public abstract class Zwierze {

    private final int age;

    public Zwierze(int age){
        this.age = age;
    }

    public abstract String dajGlos();

}
