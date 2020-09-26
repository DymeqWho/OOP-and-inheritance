package com.sda.komputer;

public class KomputerMain {

    public static void main(String[] args) {

        Proces procesorIntel = new IntelCore();
        PlytaGlowna plytaGlownaIntel = new IntelCore();
        Proces procesorAmd = new AmdRyzen();
        PlytaGlowna plytaGlownaAmd = new AmdRyzen();

        Komputer komputer = new Komputer(procesorAmd, plytaGlownaAmd);

        komputer.wlacz();

    }
}
