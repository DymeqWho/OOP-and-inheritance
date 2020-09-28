package com.sda.enumCwiczenie;


public class Main {
    public static void main(String[] args) {

        Parser stringParser = Parser.STRING_PARSER; //tak się odwołuje do enumów
        Parser intigerParser = Parser.INTIGER_PARSER; // tak się odwołuje do INTIGER_Enumów

        System.out.println("stringParser.getCapabilities = " + stringParser.getCapabilites());
        System.out.println("stringParser.parse = " + stringParser.parse("Wypisuje Stringa jakiegoś"));

        System.out.println("intigerParser.nameInPolish = " + intigerParser.nameInPolish());

        System.out.println("intigerParser.parse() = " + intigerParser.parse("56"));


        //Przydatne metody
        String integerParserName = Parser.INTIGER_PARSER.name();
        System.out.println("integerParserName = " + integerParserName);

        Parser stringParserParsed = Enum.valueOf(Parser.class, "STRING_PARSER");

        Parser[] values = Parser.values();

        for (Parser value : values){
            if(value.name().equals("INTIGER_PARSER")){
                System.out.println("INTIGER_PARSER found");
            }
        }


    }
}
