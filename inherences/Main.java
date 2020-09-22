package com.sda.inherences;

public class Main {

    public static void main(String[] args) {

        //Zmienna: Person, nazwa: person = nowy: new, obiekt: Person()
    Person person = new Person("Dymitr", "Misiejuk");

    sayHello(person);

        System.out.println();

    Student student = new Student("DymitrStudent", "MisiejukStudent", 123456); //Student jest Person, więc może korzysta ze wszystkiego, co nie jest private w Person.


    sayHello(student); //Student jest osobą, więc mogę wywałać tu studenta, bo kazdy student to osoba
    student.greetByStudent();


        System.out.println();
        //Object <------ Person <---(extends)--- Student; Obiekt jest Studentem. który rozszerza Persona
    Person personStudent = new Student("DymitrPersonStudent", "MisiejukPersonStudent", 123456); //Patrzę na studenta jak na osobę!!!
                                        //Student jest osobą. Klasa Student dziedziczy po klasie Person.
                                        // Zmienna typu Prson, ale siedzi kółko Student. Student ma dostep do wszystkich rzeczy które nie są prywatne
                                        // To że jest obiekt Student, nie znaczy, że zmienna Person ma to, co jest w studencie.

        sayHello(personStudent);


    }

    public static void sayHello(Person osoba){ // Tworzę metodę, która opisuje i osobę i studenta, bo każdy (rodzic obiektu) to osoba Person, czyli Student jest Person.
        osoba.greetByPerson();
    }

}
