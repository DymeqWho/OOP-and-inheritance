package com.sda.interfaceEx1;

public class Main {

    public static void main(String[] args) {
        Dummy animal1 = new Animal(); //interfejs daje nam typ danych
        Moveable animal2 = new Animal();


        System.out.println("animal2speed = " + animal2.getSpeed());

        Animal animal3 = new Animal();
        //Klasa Animal implementuje Screemable. Każdy obiekt typu Animal jest też obiektem typu Screemable. Mogę stworzyć taki obiekt. animal IS - A Screemable
        Screemable screemable = animal3;
        //Screemable IS - A Speakable
        Speekable speekable = screemable;

        screemable.screem();
        speekable.speek();

        animal3.screem();
        animal3.speek();
    }
}
