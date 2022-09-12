Feature: Acceso a 'My Account'
  como cliente suscrito
  Para verificar mi acceso
  Quiero ir a la sección My Account
  Scenario: Ingresar a la sección My Account
    Given Estoy en el page Iniciar sesión
    When Ingreso mis credenciales de acceso
    And Hago click en el botón de inicio de sesión e ingreso al Home
    And Hago click en botón menu
    And Seleccione opción My Account
    Then debería estar en la página My Account
