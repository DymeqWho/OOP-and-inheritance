package com.sda.interfaceEx4;

public class OdtwarzaczCD implements OdtwarzaczFilmow{

  //  private final String CD = "CD";
  //  private final String tytuł = "Star Wars";


    @Override
    public String odtwarzajFilm(String film, String typ) {
        return "odtwarzam film " + film + " " + typ ;
    }

    @Override
    public void stop() {
        System.out.println("zatrzymuję CD");
    }
}
