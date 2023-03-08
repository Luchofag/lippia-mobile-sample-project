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
    And el usuario agrega un time entry con los siguientes datos '<hour>', y '<minute>'
    And edita la descripcion con la leyenda de 'TP FINAL'
    When guarda el time entry, vuelve al dashboard
    Then se ve el Dashboard en pantalla
    Examples:
      | email                   | password | hour | minute |
      | luciano.fag95@gmail.com | No153624 | 9    | 50     |


  Scenario Outline: El agrega un registro de tiempo con fecha
    Given The app is loaded correctly
    When El usuario se logea en la aplicacion con <email>, <password>
    And el usuario agrega un time entry con los siguientes datos '<hour>', y '<minute>'
    And edita la descripcion con la leyenda de 'TP FINAL'
    And el usuario agrega un time entry con la fecha el '<day>', '<month>' y '<year>'
    And selecciona el proyecto en el que esta trabajando
    When guarda el time entry, vuelve al dashboard
    Then se ve el Dashboard en pantalla
    Examples:
      | email                   | password | hour | minute | day | month | year |
      | luciano.fag95@gmail.com | No153624 | 1    | 5      | 16  | April | 2023 |

  @Smoke
  Scenario Outline: El agrega un registro de tiempo con fecha para descartar y luego realizar un logout
    Given The app is loaded correctly
    When El usuario se logea en la aplicacion con <email>, <password>
    And el usuario agrega un time entry con los siguientes datos '<hour>', y '<minute>'
    And edita la descripcion con la leyenda de 'TP FINAL'
    And el usuario agrega un time entry con la fecha el '<day>', '<month>' y '<year>'
    And selecciona el proyecto en el que esta trabajando
    When termina de editar el time entry, lo descarta y vuelve al dashboard
    And ingresa a la configuracion y cambia al modo oscuro
    And realiza un logout
    Then verifica que se haya realizado exitosamente el logout
    Examples:
      | email                   | password | hour | minute | day | month | year |
      | luciano.fag95@gmail.com | No153624 | 13   | 50     | 7   | June  | 2023 |