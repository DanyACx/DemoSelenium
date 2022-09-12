Feature: Acceso a 'Parent Zone'
  como cliente suscrito
  Para verificar contenido de padres
  Quiero ir a la sección Parent Zone
  Scenario: Ingresar a la sección Parent Zone
    Given Estoy en la vista Iniciar sesión
    When Ingreso mis credenciales
    And Hago click en inicio de sesión e ingreso al Home
    And Hago click en menu
    And Seleccione opción Parent Zone
    Then debería estar en la página Parent Zone