Feature: Funcionalidad de Login
  como cliente
  Para usar la web mobile
  Quiero iniciar sesión con operador y msisdn.
  Scenario: Iniciar sesión con credenciales válidas
    Given Estoy en la página Iniciar sesión
    When Selecciono el país ‘Kuwait’
    And Selecciono el operador ‘Zain’
    And Lleno el cuadro de texto del MSISDN con el valor '2022051801'
    And Hago clic en el botón de inicio de sesión
    Then debería estar en la página de home

