package com.sda.inner;

public class OuterClass {

    public void foo(){
        InnerStaticClass innerStaticClass = new InnerStaticClass();
        //do something with innerStaticClass object
    }

    public void bar(){
        //Klasa lokalna
        //istnieje tylko na potrzeby tej metody
        class MinMax{
            private int min;
            private int max;
        }
        MinMax minMax = new MinMax();
    }

    //klasa statyczna wewnętrzna
    static class InnerStaticClass {
    }

    //klasa niestatyczna wewnętrzna
    class InnerNonStaticClass{

    }

}

