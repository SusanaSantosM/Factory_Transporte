package com.dam.factory_transporte;

import com.dam.factory_transporte.Bicicleta;
import com.dam.factory_transporte.Camion;

public class FactoryTransporte {
  public static final int Camion=1;
  public static final int Bicicleta=2;

  /**
   * Método que devuelve la cantidad de producto segun su tipo de clase
   * @param type clase
   * @param nProductos numeros de productos
   * @return
   */
  public static ITransporte getTransporte(int type, int nProductos){
    switch(type) {
      case Camion:
        return new Camion(2);
      case Bicicleta:
        return new Bicicleta(4);
      default:
        break;
    }
    return null;
  }
}
