package com.upiicsa.poo;

public class Ciudad {

    String nombre;
    int poblacion;
    String superficie;
    String estado;

    Ciudad() {
        super();
    }

    Ciudad(String nombre, int poblacion, String superficie, String estado) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.estado = estado;
    }
    
    public void imprimeCiudad(){
        System.out.println("---- Ciudad----");
        
        System.out.println("Ciudad: "+this.nombre);
        System.out.println("Numero de poblacion: "+this.poblacion);
        System.out.println("La superficie es: "+this.superficie);
        System.out.println("El estado en el que se encuentra es: "+this.estado);

    }
        

}
