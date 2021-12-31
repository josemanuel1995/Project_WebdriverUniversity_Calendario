@test
Feature: Seleccionar una fecha en el calendario

  Yo como usuario
  Quiero seleccionar una fecha especifica

@Scenario:
Scenario:  Seleccionar la fecha escogida
Given el usuario esta en la pagina de inicio
When el sistema despliega el panel calendario
And el sistema ingresa la fecha en el calendario
|dia    |mes     | anio |
|5      |Jun     | 2019 |
  Then el sistema deberia poder ver los datos ingresados en el calendario