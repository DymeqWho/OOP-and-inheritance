package com.sda.Figury;


import java.util.Scanner;

public class FiguryMain {
    public static void main(String[] args) {



        Prostokat p1 = new Prostokat(10, 12);
        Prostokat p2 = new Prostokat(11,10);
        Kwadrat k1 = new Kwadrat(10);
        Kwadrat k2 = new Kwadrat(12);


        Prostokat[] figury = new Prostokat[4];
        figury[0] = p1;
        figury[1] = p2;
        figury[2] = k1;
        figury[3] = k2;

        for (int i = 0; i < figury.length; i++){
            System.out.println(figury[i].toString());
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print ("Kwadrat/Prostokąt? ");
        String figureType = scanner.nextLine();
        if ("Kwadrat".equals(figureType)){
            System.out.print("Podaj długość kwadratu: ");
            double bok = scanner.nextDouble();
            Kwadrat kwadrat = new Kwadrat(bok);
            System.out.println("Pole Kwadrata = " + kwadrat.obliczPole() );
            System.out.println("Obwód Kwadrata = " + kwadrat.obliczObwod());
        } else {
            System.out.print("Podaj długośc boku: ");
            double dlugosc = scanner.nextDouble();
            double szerokosc = scanner.nextDouble();
            Prostokat prostokat = new Prostokat(dlugosc, szerokosc);
            System.out.println("Pole prostokąta wynosi: " + prostokat.obliczPole());
            System.out.println("Obwód prostokąta wynosi: " + prostokat.obliczObwod());
        }

    }
}
