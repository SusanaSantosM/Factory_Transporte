/**
 * Interface que tiene los métodos y atributos que son comunes para las clases.
 * Esto permite crear las distintas partes de los objetos de las clases.
 */
public interface ITransporte {
    /**
     * @param PALET tipo de embalaje
     */
     final static int PALET=0;
    /**
     * @param ENVOLTORIO_CARTON tipo de embalaje
     */
     final static int ENVOLTORIO_CARTON=1;
    /**
     * @param CAJA_MADERA tipo de embalaje
     */
     final static int CAJA_MADERA=2;

    /**
     * Método para hallar el cosgte total de la entrega.
     * @param codigoPostal
     * @return costeTotal con valor Float
     */
    Float costeTotal(Integer codigoPostal);

    /**
     *
     * @param x ancho del producto
     * @param y largo del producto
     * @param z alto del producto
     * @param peso del producto
     * @return el tipo de embalaje con valor tipo Integer
     */
    Integer tipoEmbalaje(Float x, Float y, Float z, Float peso);

}
