package com.sda.interfaceEx2;

public class Waz implements Zwierze, RuchomeZwierze {

    @Override
    public void dajGlos() {
        System.out.println("SSSSSSSSSSSSS!!!");
    }

    @Override
    public void ruszaj() {
        System.out.println("...");
    }
}
