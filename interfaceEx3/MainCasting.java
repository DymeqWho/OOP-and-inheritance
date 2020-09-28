package com.sda.interfaceEx3;

import com.sda.abstract3dClass.Circle;

public class MainCasting {
    public static void main(String[] args) {

        //casting up
        //Typ -----> obiekt
        Koło c = new Koło();
        Shape s = c;
        Object o = s;


        //casting down
        Shape downcastedDangerouslu = (Shape)o;

        //casting down safe
        if (o instanceof Koło){ //sprawdzamy czy to co jest pod "o" przechowuje to samo, co kółko?
            Koło castedCircle = (Koło)o;

        }



    }
}
