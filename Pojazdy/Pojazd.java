package com.sda.Pojazdy;

import java.util.Scanner;

public class Pojazd {

    Scanner scanner = new Scanner(System.in);
    protected int maxSpeed;
    protected int actualSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        System.out.print("Podaj aktualną prędkość: ");
        this.actualSpeed = scanner.nextInt();
    }

    public Pojazd(int maxSpeed, int actualSpeed) {
        this.maxSpeed = maxSpeed;
        this.actualSpeed = actualSpeed;
    }

    public void wypiszAktualSpeed() {
        if (actualSpeed > maxSpeed || actualSpeed <= 0) {
            int i = 0;
            while (actualSpeed > maxSpeed || actualSpeed <= 0) {
                System.out.print("Nie możesz tak szybko przemieszczać się tym pojazdem!" + actualSpeed +
                        " Twoja maksymalna prędkość tym pojazdem musi być większa bądź równa 0 i mniejsza niż : " + maxSpeed + " ");
                setActualSpeed(actualSpeed);
                i++;
            }
        } else {
            System.out.println("Przemieszczasz się z prędkością: " + actualSpeed);
        }
    }

    public String toString() {
       return "Pojazd ma prędkość maksymalną: " + maxSpeed + ", aktualną prędkość " + actualSpeed;
    }
}
