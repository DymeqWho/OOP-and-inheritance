package com.sda.procesor;

public class KomputerMain {
    public static void main(String[] args) {

        Komputer komputer = new Komputer("...", "...");

        //amd or intel?
        komputer.setPlytaGlowna("intel");
        komputer.setProcesor("intel");

        komputer.wlacz();

    }

}
