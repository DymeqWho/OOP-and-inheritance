package com.sda.komputer;

public class AmdRyzen implements Proces, PlytaGlowna {

    @Override
    public boolean czyIntel() {
        return false;
    }

    @Override
    public boolean czyObslugujeIntel() {
        return false;
    }
}
