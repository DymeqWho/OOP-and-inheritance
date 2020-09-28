package com.sda.sklepy;

public class Main {
    public static void main(String[] args) {

        Sklep lidl = new Sklep("Lidl", DniTygodnia.PONIEDZIALEK, DniTygodnia.CZWARTEK, DniTygodnia.SOBOTA);

        Sklep zabka = new Sklep("Zabka", DniTygodnia.PONIEDZIALEK, DniTygodnia.NIEDZIELA);

        Sklep[] skleps = {lidl, zabka};

        int openInMonday = countOpenShops(skleps, DniTygodnia.PONIEDZIALEK);
        System.out.println("openInMonday = " + openInMonday);

    }

    private static int countOpenShops(Sklep[] skleps, DniTygodnia dzien){
        int numberOfSkleps = 0;
        for(Sklep sklep : skleps){
            if (sklep.isOpen(dzien)){
                ++numberOfSkleps;
            }
        }
        return numberOfSkleps;
    }

}
