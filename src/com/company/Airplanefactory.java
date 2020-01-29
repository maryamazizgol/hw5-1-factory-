package com.company;

public class Airplanefactory {

    public static Airplane getairplan(int a){
        switch ( a ){
            case 1 : return new Airbus();
            case 2 : return new ATR();
            case 3 : return new Boeing();
            case 4 : return new Fokker();
            default: return null ;
        }
    }


}
