Feature: yo como usuario del servicio
  Necesito registrar la cuenta en  linkedin
  Para estar registrado en el sistema

  Scenario: ingresar al sistema por primera vez
    Given que Elvis esta en el portal
    When el seleciona el producto a comprar
      | nombreProducto |
      | Dell i7 8gb    |
    Then el usuario debe ver el nombre Product added