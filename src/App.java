/**
 * La clase App en donde se pone a prueba la fábrica de transporte y su correcto funcionamiento.
 */
public class App {
    static ITransporte transporte;
    public static void main(String[] args) {
        /**
         * Demostracion para Camión.
         */
        transporte = FactoryTransporte.getTransporte(FactoryTransporte.Camion);
        if( transporte != null){
            System.out.println("En Camión: ");
            System.out.println("Costo total del envio: " +transporte.costeTotal(36210)+" euros");
            System.out.println("Tipo de embalaje: "+transporte.tipoEmbalaje(16f,25.3f,11.5f,39.25f)+"\n");
        }else
            System.out.println("Error. Vuelva a intentarlo");

        /**
         * Demostración para Bicicleta.
         */
        transporte = FactoryTransporte.getTransporte(FactoryTransporte.Bicicleta);
        if( transporte != null){
            System.out.println("En Bicicleta: ");
            System.out.println("Costo total del envio: " +transporte.costeTotal(36206)+" euros");
            System.out.println("Tipo de embalaje: "+transporte.tipoEmbalaje(5.0f,0.6f,9f,3.5f)+"\n");
        }else
            System.out.println("Error. Vuelva a intentarlo");
    }
}