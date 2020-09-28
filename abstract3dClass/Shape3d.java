package com.sda.abstract3dClass;

public abstract class Shape3d extends Shape { //gdy klasa abstrakcyjna nadpisuje klasę abstrakcyjną, nie musi nic innego robić jak zrobić konstruktor

    public Shape3d(String name){
        super(name);
    }

    public abstract double calculateVolume();
}
