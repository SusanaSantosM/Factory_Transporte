public class Bicicleta implements ITransporte{
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
        float costeTotal;//(codigoPostal/nProductos)/1000;
        if(codigoPostal>36200)costeTotal=5f;
        else costeTotal=6f;
        return costeTotal;
    }

    /**
     * Método para encontrar el costo del tipo de embalaje según su volumen
     * @param x ancho del producto
     * @param y largo del producto
     * @param z alto del producto
     * @param peso del producto
     * @returnt tipo de embalaje
     */
    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        float pesoVolumetrico=(x*y*z);
        if(pesoVolumetrico<50 || peso<5){
            return ENVOLTORIO_CARTON;
        }else if (pesoVolumetrico<50 || peso>5) {
            return CAJA_MADERA;
        }else{
            return PALET;
        }
    }
}
