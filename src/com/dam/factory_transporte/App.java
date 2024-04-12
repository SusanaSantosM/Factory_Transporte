package com.dam.factory_transporte;

public class App {
  public static void main(String[] args) {
    /**
     * Demostracion de Camión
     */
    Camion camion = new Camion();
    camion = (Camion) FactoryTransporte.getTransporte(1,25);
    camion.costeTotal(36210);
    camion.tipoEmbalaje(16f,25.3f,11.5f,39.25f);

    /**
     * Demostración de com.dam.factory_transporte.Bicicleta
     */
    Bicicleta bicicleta = new Bicicleta();
    bicicleta = (Bicicleta) FactoryTransporte.getTransporte(2,4);
    bicicleta.costeTotal(36206);
    bicicleta.tipoEmbalaje(5.0f,0.6f,9f,3.5f);
  }
}