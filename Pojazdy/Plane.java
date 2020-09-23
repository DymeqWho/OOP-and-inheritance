package com.sda.Pojazdy;

public class Plane extends Pojazd{

    private int numberOfEngins;

    public Plane(int maxSpeed, int actualSpeed, int numberOfEngins){
        super(maxSpeed, actualSpeed);
        this.numberOfEngins = numberOfEngins;
    }

    @Override
    public int getMaxSpeed() {
        return 800;
    }

    @Override
    public void setActualSpeed(int actualSpeed) {
        System.out.print("Podaj aktualną prędkość smolotu: ");
        this.actualSpeed = scanner.nextInt();
    }

    @Override
    public void wypiszAktualSpeed() {
        if (actualSpeed > maxSpeed || actualSpeed <= 0) {
            int i = 0;
            while (actualSpeed > maxSpeed || actualSpeed <= 0) {
                System.out.print("Nie możesz tak szybko przemieszczać się tym samolotem! " + actualSpeed +
                        " Twoja maksymalna prędkość tym samolotu musi być większa bądź równa 0 i mniejsza niż : " + maxSpeed + " ");
                setActualSpeed(actualSpeed);
                i++;
            }
        }
        if (actualSpeed <= maxSpeed && actualSpeed >=0) {
            System.out.println("Przemieszczasz się samolotem z prędkością: " + actualSpeed);
        }
    }

    @Override
    public String toString() {
        return "Samochód ma prędkość maksymalną: " + maxSpeed + ", aktualną prędkość: " + actualSpeed + ", ma ilość silników: " + numberOfEngins;
    }
}
