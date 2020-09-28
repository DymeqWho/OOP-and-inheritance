package com.sda.enumCwiczenie;

public enum Parser implements  ValueParser{ //tak się definiuje enumy. Nie jest to kółko pamięci C, tylko E
    //konwencja ennumów to duze litety z podkreślnikiem

    //zmienne obiektów nie mogą być zmieniane dynamicznie. Są niezmienne!
    STRING_PARSER("I can parse strings"){
        @Override                                   //interfejsy wywołujemy jako klasy anonimowe
        public Object parse(String str) {
            return str;
        }
    }, //to będzie stworzony Obiekt. To gwarantuje JVM/ Nie ma "new". To jest z góry podane, stałe, mozna tylko z góry określić.
    INTIGER_PARSER("I can parse intigers"){
        @Override                                   //interfejsy wywołujemy jako klasy anonimowe
        public Object parse(String str) {
            return Integer.parseInt(str);
        }
    }; // to będzie drugi Obiekt. To gwrantuje JVW. Nie ma "new"

    private final String capabilites; // to jest zwykłe pole w klasie. Enumy zawsze zapisuje się w private final

    Parser(String capabilites) {
        this.capabilites = capabilites;
    }

    public String getCapabilites(){ //w enumach można robić zwykłe metody
        return capabilites;
    }

    public String nameInPolish(){
        switch (this){
            case STRING_PARSER:
                return "Parser Stringów";
            case INTIGER_PARSER:
                return "Parser intów";
            default:
                return "WTF?!";
        }
    }

}
