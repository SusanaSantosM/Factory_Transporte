package com.dam.factory_transporte;

public class Camion implements ITransporte {
  /**
   * @Autor Susana Santos
   * @version 1.0
   */
  int nProductos;

  /**
   * Cnstructor por defecto
   */
  public Camion() {
  }

  /**
   * @param nProductos
   */
  public Camion(int nProductos) {
    this.nProductos = nProductos;
  }

  /**
   * Método para encontrar el coste total del envio
   * @param codigoPostal
   * @return coste total
   */
  @Override
  public Float costeTotal(Integer codigoPostal) {
    float costeTotal=(codigoPostal/nProductos)/100;
    System.out.println("coste total para envio en camión=" +costeTotal);
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
    System.out.println("El peso del producto= "+pesoVolumetrico+" y el tipo de embalaje es: "+2);
    return 2;
  }
}
