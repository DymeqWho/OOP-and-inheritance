package com.sda.procesor;

public class IntelCore implements Proces, PlytaGlowna{

    public IntelCore(){};

    @Override
    public boolean czyObslugujeIntel() {
        return true;
    }

    @Override
    public boolean czyIntel() {
        return true;
    }
}
