package com.sda.interfaceEx4;

public interface OdtwarzaczFilmow {

    String odtwarzajFilm(String film, String typ);

    default void stop(){
        System.out.println("zatrzymuję odtwarzanie!");
    }
}
