package com.sda.Animals;

public class Dog extends Animal {

    private String color;

    public Dog(String name, int age, String race, String color) { //Konstruktor Psa
        super(name, age, race);
        this.color = color;
    }

    @Override
    public void voice() {
        System.out.println("Hau, hau, wrrrr, hau!");
    }
}
