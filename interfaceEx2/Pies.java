package com.sda.interfaceEx2;

public class Pies implements Zwierze, RuchomeZwierze{

    @Override
    public void dajGlos() {
        System.out.println("Hau, hau!");
    }

    @Override
    public void ruszaj() {
        System.out.println("...");
    }
}
