package com.sda.inherences;

public class MainOverloading { //Nowa klasa main, żeby nie "brudzić kodu" w Main
    public static void main(String[] args) {


       Person person = new Person("Dymitr", "Misiejuk");
       greet(person);


                            //Nowy obiekt Student
        Person student = new Student("Dymitr", "Misiejuk", 123456798); //Java wie, że to jest Student, chociaż "zmienna" Person <--Polimorficzne wywołanie
        greet(student);

    }

    public static void greet(Person p){
        p.sayHello(); //ściąam sobie do metody greet metodę sayHello() ze Student i Person. To, co się wyświetli zależy od tego, na jakim obiekcie pracujemy
    }

}
