public class FactoryTransporte {
    public static final int Camion=1;
    public static final int Bicicleta=2;

    /**
     * Método que devuelve la cantidad de producto según su tipo de clase
     * @param tipo clase
     * @return Instancia de la clase elegida
     */
    public static ITransporte getTransporte(int tipo){
        switch(tipo) {
            case Camion:
                return new Camion();
            case Bicicleta:
                return new Bicicleta();
            default:
                break;
        }
        return null;
    }
}
