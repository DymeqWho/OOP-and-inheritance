package com.sda.komputer;

public class KomputerMain {

    public static void main(String[] args) {

        Proces procesorIntel = new IntelCore();
        PlytaGlowna plytaGlownaIntel = new IntelCore();
        Proces procesorAmd = new AmdRyzen();
        PlytaGlowna plytaGlownaAmd = new AmdRyzen();

        Komputer komputerIntel = new Komputer(procesorIntel, plytaGlownaIntel);

        System.out.print("Komputer obsługuje Intel: ");
        komputerIntel.wlacz();

        Komputer komputerAmd = new Komputer(procesorAmd, plytaGlownaAmd);

        System.out.print("Komputer obsługuje AMD: ");
        komputerAmd.wlacz();

        Komputer komputerMix = new Komputer(procesorAmd, plytaGlownaIntel);

        System.out.print("Komputer to mix części: ");
        komputerMix.wlacz();

    }
}
