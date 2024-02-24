# FACTORY TRANSPORTE 📦

> En este repositorio encontramos una aplicación que crea según los parámetros que se introduzca, los tipos de envios de paquetes y
el coste de cada paquete, esto varia según el código postal del lugar de envio.
La aplicación tiene dos tipos de transporte que se van a instanciar, los cuales son: camión y bicicleta.

## Interfaces

* __ITransporte__

  Es la interfaz común que se implementará en las clases Camión y Bicicleta. En esta interefaz     encontramos lasvariables contastes (PALET, ENVOLTORIO_CARTON, CAJA_MADERA) las cuales van a      ser utilizadas en uno de los métodos.
  También encontramos los métodos:

      - CosteTotal: Recibe el código postal como parametro y devuelve el costo total para enviar un paquete a dicho código.  
      - TipoEmbalaje: Recibe las dimensiones (ancho x, alto y, largo z) y el peso del paquete como parametros. Devuelve un entero que es el tipo de embalaje: PALET = 0, ENVOLTORIO_CARTON = 1, CAJA_MADERA = 2.


## Clases

- __Camión__ 🚚

  En esta clase implementamos la interfaz común que es **ITransporte**, lo cual nos va a           proporcionar también la implementación de los métodos que tenga la interfaz. Estos métodos son   CosteTotal y tipoEmbalaje.


- __Bicicleta__ 🚲

  En esta clase implementamos la interfaz común que es **ITransporte**, lo cual nos va a           proporcionar una implementación de los métodos que tenga la interfaz. Estos métodos son          CosteTotal y tipoEmbalaje.


- __FactoryTransporte__

  En esta clase tenemos un **método estático: getTransporte**, el cual nos va a permitir obtener   las instancias de diferentes tipos de transporte. Estos tipos de transporte (Camión y Bicicleta), son definidas como constantes que van a ser llamadas por el método y así devolver una instancia del tipo de objeto correspondiente que implemente la interfaz **ITransporte**.


- __App__

  Esta es la clase principal de la aplicación, donde se ecnuentra el método main. Aquí se va a     probar el funcionamiento de la fábrica de transporte. Para ello vamos a instanciar a Camión y    a Bicicleta desde la __FactoryTransporte__ utilizando el __método getTransporte__. Con esto     podremos visualizar el coste de envio y el tipo de embalaje de cada instancia.

