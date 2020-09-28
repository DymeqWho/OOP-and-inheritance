package com.sda.anonymusClass;

public class Main {
    public static void main(String[] args) {

        Person person = new Person() {
            @Override // klasa anonimowa. Tylko dla tego obiektu. Ona jest dostępna tylko raz, tylko dla tego obiektu, nigdzie indziej, Mooże być stworzona wszędzie do obiektu.
            public String getName() {
                return "Kamil";

            }
        };


        System.out.println("person.getName " + person.getName());

        Person oldPerson = new Person() {
        }; // tutaj odwołujemy się już do tego, co było w klasie Person, czyli nie nadpisuje metody getPerson.

        System.out.println("oldPerson.getName " + oldPerson.getName());

    }
}
