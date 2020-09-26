package com.sda.komputer;

public class Komputer implements Proces, PlytaGlowna {

    private boolean wlaczony;
    private Proces procesor;
    private PlytaGlowna plytaGlowna;

    public void setProcesor(Proces procesor) {
        this.procesor = procesor;
    }

    public void setPlytaGlowna(PlytaGlowna plytaGlowna) {
        this.plytaGlowna = plytaGlowna;
    }

    public Proces getProcesor() {
        return procesor;
    }

    public PlytaGlowna getPlytaGlowna() {
        return plytaGlowna;
    }

    @Override
    public boolean czyObslugujeIntel() {
        return true;
    }

    @Override
    public boolean czyIntel() {
        return true;
    }

    public Komputer(Proces procesor, PlytaGlowna plytaGlowna) {
        this.plytaGlowna = plytaGlowna;
        this.procesor = procesor;

    }

    IntelCore intelCore = new IntelCore();
    AmdRyzen amdRyzen = new AmdRyzen();


    private boolean czyCzesciPasuja() {
        if ((procesor.czyIntel() == intelCore.czyIntel() && plytaGlowna.czyObslugujeIntel() == intelCore.czyObslugujeIntel()) || (procesor.czyIntel() != amdRyzen.czyIntel() && plytaGlowna.czyObslugujeIntel() != amdRyzen.czyObslugujeIntel())) {
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
