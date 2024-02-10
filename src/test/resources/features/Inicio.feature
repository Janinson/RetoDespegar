Feature: Automatización del flujo de reserva en Despegar.com

  Scenario: Realizar una reserva con todos los campos diligenciados
    Given que estoy en la página principal de Despegar.com
    When realizo una busqueda de servicios con los datos requeridos
    And selecciono un resultado de búsqueda según los criterios especificados
    And diligencio los campos de pago con tarjeta de crédito
    Then se da por finalizada la ejecución del flujo de reserva