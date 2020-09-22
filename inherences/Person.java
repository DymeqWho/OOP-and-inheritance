package com.sda.inherences;

public class Person {

   // private String name;
    protected  String name;
   // private String lastName;
   protected String lastName;



    public Person(String name, String lastName) { //inicjuję Person w ten sposób
        this.name = name;
        this.lastName = lastName;
        System.out.println("Constructing person...");
    }




    //Metoda, którą robi każdy Person
    public void greetByPerson() {
        System.out.println("Hello from Person");
    }

    public void sayHello(){
        System.out.println("Hello. I am " + "+" + name + " " + lastName);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
