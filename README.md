# Automatización del flujo de reserva en Despegar.com

Este proyecto tiene como objetivo automatizar el flujo de reserva en Despegar.com utilizando el framework de pruebas Serenity BDD.

## Funcionalidad

El flujo de reserva automatizado consta de los siguientes pasos:

### Escenario: Realizar una reserva con todos los campos diligenciados

1. **Dado** que estoy en la página principal de Despegar.com
2. **Cuando** realizo una búsqueda de servicios con los datos requeridos
3. **Y** selecciono un resultado de búsqueda según los criterios especificados
4. **Y** diligencio los campos de pago con tarjeta de crédito
5. **Entonces** se da por finalizada la ejecución del flujo de reserva

## Dependencias

Este proyecto utiliza las siguientes dependencias:

- **Serenity BDD**: Framework de automatización de pruebas.
- **SLF4J Simple**: Implementación simple de SLF4J para registro de eventos.
- **JUnit**: Framework de pruebas unitarias para Java.
- **COM4J**: Librería para la comunicación con objetos COM desde Java.
- **Apache POI**: Librería para manejar archivos de Microsoft Office.
- **WebdriverManager**: Utilidad para la administración de controladores de Selenium WebDriver.

## Configuración del Proyecto

El proyecto está configurado utilizando Gradle como herramienta de construcción. Se ha configurado el plugin de Serenity para generar reportes.

### Repositorios

- Se han configurado los siguientes repositorios para la descarga de dependencias:
    - Maven Local
    - Maven Central
    - JCenter

### Tareas

- **JavaCompile**: Se ha configurado el encoding del proyecto como UTF-8.
- **Test**: Se ha establecido para ignorar los fallos al ejecutar las pruebas.
- **Gradle StartParameter**: Se ha configurado para continuar en caso de fallo en alguna tarea de Gradle.

## Ejecución de Pruebas

Para ejecutar las pruebas, utiliza el siguiente comando:

./gradlew clean test


## Clases y Funcionalidades

El proyecto cuenta con las siguientes clases y funcionalidades:

### Clase `InicioStep`

La clase `InicioStep` contiene los pasos de automatización para el flujo de reserva en Despegar.com. A continuación, se detallan los métodos disponibles:

- **`abrirNavegador()`**: Abre el navegador y carga la página principal de Despegar.com.
- **`clicEnAjendamiento()`**: Realiza un clic en el botón de alojamiento.
- **`escribirDestino()`**: Escribe el destino en el campo de búsqueda.
- **`ingresarFechaEntrada()`**: Ingresa la fecha de entrada.
- **`ingresarFechaSalida()`**: Ingresa la fecha de salida.
- **`clicEnBuscar()`**: Realiza un clic en el botón de búsqueda.
- **`clicEnVerDetalle()`**: Realiza un clic en el botón de ver detalle.
- **`clicEnReserva()`**: Realiza un clic en el botón de reserva.
- **`clicEnReservarSinDescuento()`**: Realiza un clic en el botón de reserva sin descuento.
- **`clicEnSeleccionar()`**: Realiza un clic en el botón de selección.
- **`clicTarjetaCredito()`**: Realiza un clic en el campo de tarjeta de crédito.
- **`ingresarNumeroTarjetaCredito()`**: Ingresa el número de tarjeta de crédito obtenido desde el archivo Excel "DatosUsuario".
- **`ingresarTitularTarjeta()`**: Ingresa el titular de la tarjeta de crédito obtenido desde el archivo Excel "DatosUsuario".
- **`ingresarVencimientoTarjeta()`**: Ingresa la fecha de vencimiento de la tarjeta de crédito obtenido desde el archivo Excel "DatosUsuario".
- **`ingresarCodigoSeguridad()`**: Ingresa el código de seguridad de la tarjeta de crédito obtenido desde el archivo Excel "DatosUsuario".
- **`ingresarCedula()`**: Ingresa el número de cédula de identidad obtenido desde el archivo Excel "DatosUsuario".
- **`clicPago()`**: Realiza un clic en el botón de pago.
- **`clicContinuar()`**: Realiza un clic en el botón de continuar.

Cada método corresponde a una acción específica dentro del flujo de reserva y utiliza diferentes elementos de la página de Despegar.com para interactuar con ellos.
