package com.sda.inner;

public class Main {
    public static void main(String[] args) {

        OuterClass.InnerStaticClass innerClass = new OuterClass.InnerStaticClass(); // tworzenie odwołania do statycznej klasy w klasie publicznej

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerNonStaticClass innerNonStaticClass = outerClass.new InnerNonStaticClass(); // tworzenie odwołania do niestatycznej klasy w klasie publicznej. Inna składnia

    }
}
