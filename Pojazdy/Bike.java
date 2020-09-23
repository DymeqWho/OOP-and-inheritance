package com.sda.Pojazdy;

public class Bike extends Pojazd{

    private int numberOfGear;

    public Bike(int maxSpeed, int actualSpeed, int numberOfGear){
        super(maxSpeed, actualSpeed);
        this.numberOfGear = numberOfGear;
    }

    @Override
    public int getMaxSpeed() {
        return 25;
    }

    @Override
    public void setActualSpeed(int actualSpeed) {
        System.out.print("Podaj aktualną prędkość roweru: ");
        this.actualSpeed = scanner.nextInt();
    }

    @Override
    public void wypiszAktualSpeed() {
        if (actualSpeed > maxSpeed || actualSpeed <= 0) {
            int i = 0;
            while (actualSpeed > maxSpeed || actualSpeed <= 0) {
                System.out.print("Nie możesz tak szybko przemieszczać się tym rowerem! " + actualSpeed +
                        " Twoja maksymalna prędkość tym rowerem musi być większa bądź równa 0 i mniejsza niż : " + maxSpeed + " ");
                setActualSpeed(actualSpeed);
                i++;
            }
        }
        if (actualSpeed <= maxSpeed && actualSpeed >=0){
            System.out.println("Przemieszczasz się rowerem z prędkością: " + actualSpeed);
        }
    }

    @Override
    public String toString() {
        return "Samochód ma prędkość maksymalną: " + maxSpeed + ", aktualną prędkość: " + actualSpeed + ", ma ilość przerzutek: " + numberOfGear;
    }
}
