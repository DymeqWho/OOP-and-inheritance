package com.sda.Pojazdy;

public class Car extends Pojazd {

    private String fuelType;

    public Car(int maxSpeed, int actualSpeed, String fuelType) {
        super(maxSpeed, actualSpeed);
        this.fuelType = fuelType;

    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }

    @Override
    public void setActualSpeed(int actualSpeed) {
        System.out.print("Podaj aktualną prędkość samochodu: ");
        this.actualSpeed = scanner.nextInt();
    }

    @Override
    public void wypiszAktualSpeed() {
        if (actualSpeed > maxSpeed || actualSpeed <= 0) {
            int i = 0;
            while (actualSpeed > maxSpeed || actualSpeed <= 0) {
                System.out.print("Nie możesz tak szybko przemieszczać się tym samochodem! " + actualSpeed +
                        " Twoja maksymalna prędkość tym samochodem musi być większa bądź równa 0 i mniejsza niż : " + maxSpeed + " ");
                setActualSpeed(actualSpeed);
                i++;
            }
        }
        if (actualSpeed <= maxSpeed && actualSpeed >=0) {
            System.out.println("Przemieszczasz się samochodem z prędkością: " + actualSpeed);
        }
    }

    @Override
    public String toString() {
        return "Samochód ma prędkość maksymalną: " + maxSpeed + ", aktualną prędkość: " + actualSpeed + ", jedzie na paliwie: " + fuelType;
    }
}
