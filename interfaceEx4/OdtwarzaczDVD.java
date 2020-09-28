package com.sda.interfaceEx4;

public class OdtwarzaczDVD implements OdtwarzaczFilmow{

 //   private final String DVD = "DVD";
  //  private final String tytuł = "Wywiad z Wampirem";


    @Override
    public String odtwarzajFilm(String film, String typ) {
        return "odtwarzam film " + film + " " + typ ;
    }

}
