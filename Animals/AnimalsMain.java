package com.sda.Animals;

public class AnimalsMain {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Brutus", "Mai Coon", 3);
        Dog dog1 = new Dog("Rex", 2, "Jamnik", "bury");
        Animal animal1 = new Animal("", 0, "");


        cat1.voice();
        dog1.voice();
        animal1.voice();





        Animal[] animals = new Animal[3];
        animals[0] = cat1;
        animals[1] = dog1;
        animals[2] = animal1;



    }
}
