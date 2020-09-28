package com.sda.procesor;

public class AmdRyzer implements Proces, PlytaGlowna{

    public AmdRyzer(){};

    @Override
    public boolean czyObslugujeIntel() {
        return false;
    }

    @Override
    public boolean czyIntel() {
        return false;
    }
}
