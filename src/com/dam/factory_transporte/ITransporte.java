package com.dam.factory_transporte;

public interface ITransporte {
  /**
   * Interface que tiene los métodos y atributos que son comunes para las clases.
   * Esto permite crear las distintas partes de los objetos de las clases.
   * @param codigoPostal de la ciudad
   */
   final static Integer codigoPostal =0;
  /**
   * @param palet tipo de embalaje
   */
  final static Integer palet=0;
  /**
   * @param envoltorioCarton tipo de embalaje
   */
   final static Integer envoltorioCarton=1;
  /**
   * @param cajaMadera tipo de embalaje
   */
  final static Integer cajaMadera=2;

  /**
   * Método para hallar el cosgte total de la entrega.
   * @param codigoPostal
   * @return coste
   */
  Float costeTotal(Integer codigoPostal);

  /**
   *
   * @param x ancho del producto
   * @param y largo del producto
   * @param z alto del producto
   * @param peso del producto
   * @return el tipo de embalaje que es un Integer
   */
   Integer tipoEmbalaje(Float x, Float y, Float z, Float peso);

}
