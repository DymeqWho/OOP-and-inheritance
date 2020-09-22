package com.sda.classes;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Dymitr");
        person.greet();

        Person person2 = person; //wskazują na to samo person i person2
        person2.greet();


        person.setName("Czubaka"); // nadpisuje name

        System.out.println("==========");
        person.greet();
        person2.greet();



    }

}
