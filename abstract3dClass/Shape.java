package com.sda.abstract3dClass;

public abstract class Shape {

    private final String name; //takie pole można inicjalizować tylko w konstruktorze

    public Shape(String name){
        this.name = name;
    }

    public abstract double calculatePeremiter(); //klasa abstrakt nie posiada ciała. Nie da się z niej zrobić obiektu. Metoda abstrakcyjna musi być w klasie abstrakcyjnej
    public abstract double calculateArea();


}
