package com.sda.komputer;

public class Komputer {

    private boolean wlaczony;
    private Proces procesor;
    private PlytaGlowna plytaGlowna;

    public Komputer(Proces procesor, PlytaGlowna plytaGlowna) {
        this.plytaGlowna = plytaGlowna;
        this.procesor = procesor;

    }

    private boolean czyCzesciPasuja() {
        if ((procesor.czyIntel() && plytaGlowna.czyObslugujeIntel()) || (!procesor.czyIntel() && !plytaGlowna.czyObslugujeIntel())) {
            return true;
        } else return false;
    }

    public void wlacz() {
        String czyWlaczony = "Czy komputer jest włączony? ";
        if (czyCzesciPasuja()) {
            wlaczony = true;
            System.out.println(czyWlaczony + wlaczony);
        } else {
            wlaczony = false;
            System.out.println(czyWlaczony + wlaczony);
        }
    }
}
