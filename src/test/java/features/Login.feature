Feature: Login Portal Persona BCI

  @Regresion
  Scenario: Login Erroneo - Contrasena Incorrecta

    Given Estoy en el Sitio de BCI portal Personas
    And Presiono boton BANCO EN LINEA en home del sitio BCI portal Personas
    When Ingreso en el campo Rut el valor "178152513" en formulario de inicio de sesion
    And Ingreso en el campo Clave el valor "123456" en formulario de inicio de sesion
    And Presiono boton CONTINUAR  en formulario de inicio de sesion
    Then Visualizo el titulo del mensaje en formulario de inicio de sesion
              """
              Recupera tu clave de internet
              """
    And Visualizo la descripcion del mensaje en formulario de inicio de sesion
              """
              Recupera el acceso a tu Banco en línea con tu RUT y validando tus datos.
              """
  @Regresion
    Scenario Outline: Login con datos multiples
      Given Estoy en el Sitio de BCI portal Personas
      And Presiono boton BANCO EN LINEA en home del sitio BCI portal Personas
      When Ingreso en el campo Rut el valor <rut> en formulario de inicio de sesion
      And Ingreso en el campo Clave el valor <contrasena> en formulario de inicio de sesion
      And Presiono boton CONTINUAR  en formulario de inicio de sesion
      Then Visualizo el titulo  <tituloError> en formulario de inicio de sesion
      And Visualizo la descripcion <descError> en formulario de inicio de sesion

      Examples:
        |  rut   | contrasena | tituloError | descError |
        |  "178152513"   | "12312312" | "Recupera tu clave de internet" | "Recupera el acceso a tu Banco en línea con tu RUT y validando tus datos." |
        |  "108420650"   | "12312312" | "Recupera tu clave de internet" | "Recupera el acceso a tu Banco en línea con tu RUT y validando tus datos." |

  @Data
  Scenario: DataTable
    Given Los siguientes usuarios existentes
      |  rut   | contrasena |
      |  "178152513"   | "12312312" |
      |  "108420650"   | "12312312" |



