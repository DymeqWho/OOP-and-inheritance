package com.sda.interfaceEx4;

public class Main {
    public static void main(String[] args) {

        OdtwarzaczCD odtwarzaczCD = new OdtwarzaczCD();
        System.out.println(odtwarzaczCD.odtwarzajFilm("Star Wars", "CD"));
        odtwarzaczCD.stop();
        OdtwarzaczDVD odtwarzaczDVD = new OdtwarzaczDVD();
        System.out.println(odtwarzaczDVD.odtwarzajFilm("Wywiad Wampirów", "DVD"));
        odtwarzaczDVD.stop();
        OdtwarzaczBlueRay odtwarzaczBlueRay = new OdtwarzaczBlueRay();
        System.out.println(odtwarzaczBlueRay.odtwarzajFilm("Cast Away", "BlueRay"));
        odtwarzaczBlueRay.stop();

    }
}
