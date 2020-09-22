package com.sda.Animals;

public class Cat extends Animal {

    public Cat(String name, String race, int age) { //konstruktor Kota
        super(name, age, race);
    }

    @Override
    public void voice() {
        System.out.println("Miauuuu!");
    }
}
