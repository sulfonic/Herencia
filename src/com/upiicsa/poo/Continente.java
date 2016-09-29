package com.upiicsa.poo;

public class Continente extends Ciudad {

    String nombreCont;
    String superficieCont;
    int numPaises;

    Continente() {
        super();
    }

    Continente(String nombreCont, String superficieCont, int numPaises, String nombre, int poblacion, String superficie, String estado) {
        super(nombre, poblacion, superficie, estado);
        this.nombreCont = nombreCont;
        this.superficieCont = superficieCont;
        this.numPaises = numPaises;
    }

    public void imprimeContinente() {
        super.imprimeCiudad();
        System.out.println("El nombre del Continente es: " + this.nombreCont);
        System.out.println("El numero de superficie de " + this.nombreCont + " es: " + this.superficieCont);
        System.out.println("El numero de paises " + this.nombreCont + " es: " + this.numPaises);
    }
}
