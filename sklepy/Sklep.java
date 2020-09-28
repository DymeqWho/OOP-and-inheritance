package com.sda.sklepy;

public class Sklep {

    private final String name;
    private DniTygodnia[] dniOtwarte;

    //konstruktor sklepu(jego imię, DniTygodnia to enum ...varArgsy... elementy w tablicy z pola DniTygodnia[]
    public Sklep(String name, DniTygodnia... dniOtwarte) { //te ... to są var argsy. Ladnie komponuje tablice z enumów
        this.name = name;
        this.dniOtwarte = dniOtwarte;
    }

    public boolean isOpen(DniTygodnia dzien) {
        for (DniTygodnia dzienOtwarty : dniOtwarte) {
            if (dzienOtwarty == dzien) {
                return true;
            }
        }
        return false;
    }

}
