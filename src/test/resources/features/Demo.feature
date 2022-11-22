Feature: As a user i want to interact with the mobile application


  Scenario Outline: El usuario logea exitosamente
    Given The app is loaded correctly
    When El usuario se logea en la aplicacion con <email>, <password>
    Then se ve el Dashboard en pantalla
    Examples:
      | email                   | password |
      | luciano.fag95@gmail.com | No153624 |

  Scenario Outline: The user starts the application, registers a new user, changes the language, log out of the app and log in to the app.
    Given The app is loaded correctly
    When El usuario se logea en la aplicacion con <email>, <password>
    And el usuario agrega un time entry con los siguientes datos 24, y 60
    When guarda el time entry, vuelve al dashboard
    Then se ve el Dashboard en pantalla
    Examples:
      | email                   | password |
      | luciano.fag95@gmail.com | No153624 |
  @Smoke
  Scenario Outline: El agrega un registro de tiempo con fecha
    Given The app is loaded correctly
    When El usuario se logea en la aplicacion con <email>, <password>
    And el usuario agrega un time entry con la fecha el 22 de diciembre
    When guarda el time entry, vuelve al dashboard
    Then se ve el Dashboard en pantalla
    Examples:
      | email                   | password |
      | luciano.fag95@gmail.com | No153624 |


    #Dada la aplicación mobile Clockify:
    #1. Realizar un login exitoso
    #2. Agregar una entrada de datos con la información pedida, las horas
    # debe estar establecida en el Gherkin (como mínimo)
    #3. Agregar otro escenario similar al anterior,
    # pero donde se elija una fecha(Dia, mes y año)
    #4. Generar una entrada de datos, y en lugar de guardarla, cancelar el guardado
    #5. Entrar a configuraciones y cambiar una de las configuraciones (Modo oscuro,
    # notificaciones)
    #6. Realizar un log out
    #7. Realizar los cambios necesarios en el pom para correr los test con
    # dispositivos físicos o emulados
    #En todos los casos deben implementarse buenas prácticas a la hora de
    # escribir Gherkin y código.