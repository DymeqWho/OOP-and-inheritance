package com.sda.classes;

public class Person {

    //enkapsulacja

    //pola - zmienne w klasie
    private String name;
    private String lastName;
    private int age;

    public Person(){ //definiuję konstruktor nie podając żadnej wartości
        this("Nowak", 33); // domyślnie zwróci
    }


    public Person(String lastName, int age) { //definiuję konstruktor - jak tworzysz nową osobę,
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greet(){
        System.out.println("Hello, my name is " + name + ", last name " + lastName + ", age " + age);
    }

}
