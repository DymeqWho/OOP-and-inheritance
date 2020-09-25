package com.sda.CastowanieFigur;

public class CastowanieFigurMain {
    public static void main(String[] args) {

        Prostokat prostokat = new Prostokat(1, 2);
        Kwadrat kwadrat;

        int random = (int) (Math.random() * 10);

        Prostokat[] tablicaProstokatow = new Prostokat[20];

        for (int t = 0; t < tablicaProstokatow.length; t++) {
            if (t < random && tablicaProstokatow[t] == null) {
                for (int k = 0; k < 10; k++) {
                    kwadrat = new Kwadrat(1 + k);
                    tablicaProstokatow[t] = kwadrat;
                }
            } else if (tablicaProstokatow[t] == null) {
                for (int p = 0; p < tablicaProstokatow.length; p++)
                    prostokat = new Prostokat(1 + p, 2 + p);
                tablicaProstokatow[t] = prostokat;
            }
        }

        int iloscKwadratow = 0;

        for (int i = 0; i < tablicaProstokatow.length; i++) {
            if (tablicaProstokatow[i] instanceof Kwadrat) {
                iloscKwadratow++;
            }
        }
        System.out.println("Ilość kwadratów w tablicy: " + iloscKwadratow);

    }
}
