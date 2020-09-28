package com.sda.interfaceEx4;

public class OdtwarzaczBlueRay implements OdtwarzaczFilmow{

   // private final String BlueRay = "BlueRay";
  //  private final String tytuł = "Cast Away";


    @Override
    public String odtwarzajFilm(String film, String typ) {
        return "odtwarzam film " + film + " " + typ ;
    }
}
