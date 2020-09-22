package com.sda.Figury;

public class Prostokat {

    private double dlugosc;
    private double szerokosc;


    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public final double obliczPole() {
        double pole = dlugosc * szerokosc;
        return pole;
    }

    public final double obliczObwod() {
        double obwod = 2 * dlugosc + 2 * szerokosc;
        return obwod;
    }

    @Override
    public String toString() {
        return "Prostokąt: obwód wynosi: " + obliczObwod() + ", " + "pole wynosi: " + obliczPole();
    }


}
