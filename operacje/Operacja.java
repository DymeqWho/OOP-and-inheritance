package com.sda.operacje;

public enum Operacja {
    DODAWANIE,
    ODEJMOWANIE,
    DZIELENIE,
    MNOZENIE;

    private double x;
    private double y;

   /* Operacja (double x, double y){
        this.x = x;
        this.y = y;
    }*/

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public static double operacja(Operacja operacja) {
        switch (operacja) {
            case DODAWANIE:
                return DODAWANIE.getX() + DODAWANIE.getY();
            case ODEJMOWANIE:
                return ODEJMOWANIE.x - ODEJMOWANIE.getY();
            case MNOZENIE:
                return MNOZENIE.getX() * MNOZENIE.getY();
            case DZIELENIE:
                return DODAWANIE.getX() / DODAWANIE.getY();
        }
        return 0;
    }

}
