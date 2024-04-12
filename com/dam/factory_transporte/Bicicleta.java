package com.dam.factory_transporte;

public class Bicicleta implements ITransporte {
  int nProductos;

  /**
   * Constructor por defecto
   */
  public Bicicleta() {
  }

  /**
   * Constructor parametrizado
   * @param nProductos
   */
  public Bicicleta(int nProductos) {
    this.nProductos = nProductos;
  }

  /**
   * Método para encontrar el coste total del envio
   * @param codigoPostal
   * @return coste total
   */
  @Override
  public Float costeTotal(Integer codigoPostal) {
    float costeTotal=(codigoPostal/nProductos)/1000;
    System.out.println("coste total para el envio en bicicleta=" +costeTotal);
    return costeTotal;
  }

  /**
   * Método para encontrar el tipo de embalaje según su volumen
   * @param x ancho del producto
   * @param y largo del producto
   * @param z alto del producto
   * @param peso del producto
   * @returnt tipo de embalaje
   */
  @Override
  public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
    float pesoVolumetrico=(x*y*z)*peso;
    System.out.println("El peso del producto= "+pesoVolumetrico+" y el tipo de embalaje es: "+1);
    return 1;
  }
}
