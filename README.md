# Conversor de Monedas

Este proyecto en Java permite convertir entre diferentes monedas utilizando una API externa de tasas de cambio llamada ExchangeRate

## Estructura del Proyecto

El proyecto Java que cumple las siguientes funciones:

- **Principal.java**: Contiene la lógica principal del programa. Permite al usuario seleccionar el tipo de conversión deseada y el valor a convertir.
- **ApiConversion.java**: Maneja la comunicación con la API de tasas de cambio externa. Utiliza `HttpClient` para realizar solicitudes HTTP y `Gson` para deserializar la respuesta JSON.
- **Cambio.java**: Proporciona métodos estáticos para realizar conversiones de moneda. Utiliza la clase `ApiConversion` para obtener el tipo de cambio y realizar los cálculos de conversión.
- **Monedas.java**: Define una clase de datos (`record`) para representar la respuesta JSON de la API, que incluye la tasa de conversión, el código base y el código de destino.

## Uso del Programa

1. **Ejecución**: Al ejecutar `Principal.java`, se muestra un menú de opciones donde el usuario puede seleccionar el tipo de conversión que desea realizar.
2. **Selección de Conversión**: El usuario ingresa el valor a convertir y selecciona la opción correspondiente.
3. **Conversión**: La clase `Cambio` utiliza la API definida en `ApiConversion` para obtener la tasa de cambio actualizada y realiza la conversión según la selección del usuario.
4. **Finalización**: El programa permite realizar múltiples conversiones hasta que el usuario elija la opción de salir.

## Configuración

Para utilizar este proyecto, asegúrate de tener estas dependencias:

- Gson librerias
- Java 22 o superior.
- ApiKey para ExchangeRate
- Acceso a internet para realizar las solicitudes a la API de tasas de cambio.


Este proyecto ha sido desarrollado como Challenge para practicar la formación de Java Orientado a Objetos G6 - ONE.
Creado por: Jacobo Molina Miranda 
