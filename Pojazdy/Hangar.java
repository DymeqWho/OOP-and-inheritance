package com.sda.Pojazdy;

import java.util.Scanner;

public class Hangar {

 //   Scanner scanner = new Scanner(System.in);

    public void swichVehicle() {

        //   System.out.println("Wybierz pojazd:");
        //    System.out.println("1. Rower");
        //    System.out.println("2. Samochód");
        //    System.out.println("3. Samolot");
        //    System.out.println();
        //    System.out.print("Co wybierasz? ");
        //   int number = scanner.nextInt();
        int number = 1;
        switch (number) {
            case 1:

                Pojazd bike1 = new Bike(25, 0, 5);
                bike1.setActualSpeed(0);
                bike1.wypiszAktualSpeed();
                System.out.println(bike1.toString());
                System.out.println();
                //   break;

            case 2:
                Pojazd car1 = new Car(100, 0, "benzyna 95");
                car1.setActualSpeed(0);
                car1.wypiszAktualSpeed();
                System.out.println(car1.toString());
                System.out.println();
                //    break;

            case 3:
                Pojazd plane1 = new Plane(800, 0, 4);
                plane1.setActualSpeed(0);
                plane1.wypiszAktualSpeed();
                System.out.println(plane1.toString());
                //     break;
        }
    }
}
