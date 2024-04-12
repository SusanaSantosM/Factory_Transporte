import com.dam.factory_transporte.Bicicleta;
import com.dam.factory_transporte.Camion;
import com.dam.factory_transporte.FactoryTransporte;
import com.dam.factory_transporte.ITransporte;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactoryTest {
  @Test
  @DisplayName("tipo bicicleta")

  public void comprobarBicicleta(){
      ITransporte bicicleta = FactoryTransporte.getTransporte(2,4);
      Assertions.assertTrue(bicicleta instanceof Bicicleta);
  }

  @Test
  @DisplayName("tipo camion")
  public void comprobarCamion(){
      ITransporte camion = FactoryTransporte.getTransporte(1,4);
      Assertions.assertTrue(camion instanceof Camion);
  }


}
