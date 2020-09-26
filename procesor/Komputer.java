package com.sda.procesor;

public class Komputer {

    private boolean wlaczony;
    private String plytaGlowna;
    private String procesor;

    public Komputer(String plytaGlowna, String procesor) {
        this.procesor = procesor;
        this.plytaGlowna = plytaGlowna;
    }

    IntelCore intelCore = new IntelCore();
    AmdRyzer amdRyzer = new AmdRyzer();

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setPlytaGlowna(String plytaGlowna) {
        this.plytaGlowna = plytaGlowna;
    }

    private boolean czyCzesciPasuja() {
        if ((procesor.equals("intel") == intelCore.czyIntel() && plytaGlowna.equals("intel") == intelCore.czyObslugujeIntel()) || (procesor.equals("amd") == amdRyzer.czyIntel() && plytaGlowna.equals("amd") == amdRyzer.czyObslugujeIntel())) {
            return true;
        } else return false;
    }

    public void wlacz() {
        if (this.czyCzesciPasuja()) {
            this.wlaczony = true;
            System.out.println("Czy komputer jest właczony? " + this.wlaczony);
        } else {
            this.wlaczony = false;
            System.out.println("Czy komputer jest wlaczony? " + this.wlaczony);
        }
    }

}
