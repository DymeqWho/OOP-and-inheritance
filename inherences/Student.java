package com.sda.inherences;

//final = klasa student nie może być rozszerzona przez inną klasę
public class Student extends Person { //Każdy student JEST osobą

    //final - po przypisaniu wartości nie można jej zmienić
    private final long id; // jeżeli nie przypiszę wartości w konstruktorze albo w polu, gdy jest "final" to program się nie skompiluje.
    // Nie można wysyłac setterem nic. Sprawia to, że każdy obiekt biędzie dzięki temu miał swoją wartość w tym polu
    private String name;

    // Konstruktor student:
    //1. Konstruktor person
    //2. Konstruktor student

    public Student(String name, String lastName, long id) { //inicjuję Student w ten sposób
        //super ALBO this = zawsze pierwsza linijka. Nie można 2-ch na raz w przypadku konstruktora (np. to, co jest niżje: super(name, lastName).
        super(name, lastName); // zawsze pierwsza linijka. Zawołaj konstruktor od "rodzica" metodą "super". To, co rodzic deklaruje, musi być w ten sposób zadeklarowane i u Studenta
        this.id = id;
    }

    // final - metoda nie może być nadpisana @override
    public final void greetByStudent() {
        System.out.println("Hello from student");
    }

    @Override //nadpisuje coś z rodzica. Metoda ma wyglądać tak samo a robić coś innego
    public void sayHello() {
        // super.sayHello(); //odwołanie się do metody sayHello w klasie Person. Za pomocą konstruktora "super" zawsze odwołuję się do rodzica.
        // użycie metody od rodzica Person
        //  String myName = this.getName(); //tutaj wołamy metodę, bo już jesteśmy w klasie. Student jest tak jakby od razu w Person.
        //  System.out.println("myName = " + myName);
        //  String myLastName = getLastName(); //można też wywołać bez "this." Działa tak samo, to już kwestia gustu, co jest bardziej czytelne.
        //  System.out.println("myLastName = " + myLastName);
        System.out.println("name = " + name); // odwołanie do name z pola private w klasie Student
        System.out.println("name = " + super.name); // odwołanie do name z klasy rodzica - Person
        System.out.println("lastName = " + lastName);
        System.out.println("Hello. I am Student with ID " + id);
    }


}
