
package com.upiicsa.poo;

public class Pais extends Ciudad {
    
  String nombPais;
  int numEdos;
  String capital;
  
  Pais (){
      super();
  }
  
  Pais (String nombPais, int numEdos, String capital, String nombre, int poblacion, 
          String superficie, String estado){
      super(nombre, poblacion, superficie, estado);
      this.nombPais = nombPais;
      this.numEdos = numEdos;
      this.capital = capital;
  }
  
  public void imprimePais (){
      super.imprimeCiudad();
      System.out.println("El nombre del pais es: "+this.nombPais);
      System.out.println("Numero de estados del pais: "+this.numEdos);
      System.out.println("La capital de ese pais es: "+this.capital);
  }
    
}
