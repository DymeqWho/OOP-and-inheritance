package com.sda.Figury;

public class Kwadrat extends Prostokat {

    public Kwadrat(double bok) {
        super(bok, bok);
    }

    //Nie ma powodu nadpisywać, bo każdy kwadrat to prostokąt
   /* @Override
    public double obliczPole() {
        double pole = bok * bok;
        return pole;
    }

    @Override
    public double obliczObwod() {
        double obwod = 4 * bok;
        return obwod;
    }
    */

    @Override
    public String toString() {
        return "Kwadrat: obwód wynosi: " + obliczObwod() + ", " + "pole wynosi: " + obliczPole();
    }
}
