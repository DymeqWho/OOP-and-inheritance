package com.sda.AbstractClass;

public abstract class Shape { //NIE DA SIĘ STWORZY OBIEKTU KLASY ABSTRAKCYJNEJ

    public void printInfo(){
        System.out.println("This class represents: " + getName());
    }

    protected abstract String getName(); // wymuszam nadpisanie tej metody poprzez zrobienie jej abstrakcyjną!
    //Każda klasa która rozszerza tą klasę musi nadpisać tą abstrakcyjną metodę.

}
