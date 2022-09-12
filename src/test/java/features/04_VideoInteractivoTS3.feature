Feature: Jugar con 'Video Interactivo de TS3'
  como cliente suscrito
  Para jugar con video interactivo
  Quiero ir al video interactivo de la franquicia TS3
  Scenario: Ingresar al video interactivo de TS3
    Given Voy a Iniciar sesión
    When Ingreso credenciales
    And Click en inicio de sesión e ingreso al Home
    And Click en imagen de TS3
    And Me desplazo hasta el final
    And Selecciono imagen de games
    And Selecciono imagen de videos interactivos
    Then debería ver video del Quiz 1