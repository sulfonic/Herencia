
package com.upiicsa.poo;


public class Main {


    public static void main(String[] args) {
       Continente continente = new Continente ("America","43,316,000 km2", 35,
               "Valladolid",48953 , "1,117 km2", "Yucatan");
       Continente continente2 = new Continente ("Africa","30,221,535 km2", 54,
               "Lagos",13123000 , "99.6 km2", "Lagos");
       Continente continente3 = new Continente ("Europa","10,180,000 km2", 50,
               "Roma",2874038 , "1,285 km2", "Lacio");
       
       Pais pais = new Pais ("Mexico", 33, "Ciudad de Mexico", "CDMX",8918653 ,
               "1,485,000,000 km2", "CDMX");
       Pais pais2 = new Pais ("Estados Unidos de America",48 , "Washington D.C",
               "Nueva York",8491079 ,"1214 km2", "Nueva York");
       Pais pais3 = new Pais ("Canada",13 , "Ottawa", "Toronto",2615060 ,
               "630,210,000 km2", "Ontairo");
       
       continente.imprimeContinente();
       continente2.imprimeContinente();
       continente3.imprimeContinente();
       
       pais.imprimePais();
       pais2.imprimePais();
       pais3.imprimePais();
    }
    
    
}
