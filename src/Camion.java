public class Camion implements ITransporte{
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
        float costeTotal;//(codigoPostal/nProductos)/100;
        if(codigoPostal>36250){
            costeTotal=6f;
        }else
            costeTotal=7f;
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
        float pesoVolumetrico=(x*y*z);
        if(pesoVolumetrico<100 || peso<10){
            return ENVOLTORIO_CARTON;
        }else if (pesoVolumetrico<100 || peso>10) {
            return CAJA_MADERA;
        }else{
            return PALET;
        }
    }
}
