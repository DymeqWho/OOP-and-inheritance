package com.sda.interfaceEx2;

public class Kot implements Zwierze, RuchomeZwierze {



    @Override
    public void dajGlos() {
        System.out.println("Miauuu!");
    }

    @Override
    public void ruszaj() {
        System.out.println("...");
    }
}
