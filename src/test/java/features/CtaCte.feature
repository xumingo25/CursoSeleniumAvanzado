Feature: Cuenta Digital BCI

  @Regresion
  Scenario: Apertura Cta Digital BCI - 1

      Given Estoy en el Sitio de BCI portal Personas
          And Presiono boton HAZTE CLIENTE en home del sitio BCI portal Personas
          And Presiono boton ABRIR PLAN CUENTA CORRIENTE en home del sitio BCI portal Personas

      When Ingreso en el campo Nombre el valor "Domingo" en formulario apertura cuenta corriente
          And Ingreso en campo ApellidoPaterno el valor "Saavedra" en formulario apertura cuenta corriente
          And Ingreso en campo ApellidoMaterno el valor "Saavedra" en formulario apertura cuenta corriente
          And Ingreso en campo Rut el valor "17815251-3"  en formulario apertura cuenta corriente
          And Ingreso en campo TelefonoCelular el valor "68461475" en formulario apertura cuenta corriente
          And Ingreso en campo Correo el valor "domingo.saa@algo.com" en formulario apertura cuenta corriente
          And Selecciono casilla de confirmacion de captcha en formulario apertura cuenta corriente
          And Selecciono casilla de confirmacion de poliza privacidad en formulario apertura cuenta corriente
          And Presiono boton CONTINUAR  en formulario apertura cuenta corriente

      Then Visualizo el titulo del mensaje en formulario apertura cuenta corriente

              """
              Al parecer ya iniciaste una solicitud
              """

          And Visualizo la descripcion del mensaje en formulario apertura cuenta corriente

              """
              Según nuestros registros ya tienes una solicitud en curso. Te invitamos a retomar el proceso ingresando tu código de seguimiento
              """

          And Visualizo el boton RETOMAR en formulario apertura cuenta corriente

  @Regresion
  Scenario: Apertura Cta Digital BCI - 2

    Given Estoy en el Sitio de BCI portal Personas
    And Presiono boton HAZTE CLIENTE en home del sitio BCI portal Personas
    And Presiono boton ABRIR PLAN CUENTA CORRIENTE en home del sitio BCI portal Personas

    When Ingreso en el campo Nombre el valor "Domingo" en formulario apertura cuenta corriente
    And Ingreso en campo ApellidoPaterno el valor "Saavedra" en formulario apertura cuenta corriente
    And Ingreso en campo ApellidoMaterno el valor "Saavedra" en formulario apertura cuenta corriente
    And Ingreso en campo Rut el valor "17815251-3"  en formulario apertura cuenta corriente
    And Ingreso en campo TelefonoCelular el valor "68461475" en formulario apertura cuenta corriente
    And Ingreso en campo Correo el valor "domingo.saa@algo.com" en formulario apertura cuenta corriente
    And Selecciono casilla de confirmacion de captcha en formulario apertura cuenta corriente
    And Selecciono casilla de confirmacion de poliza privacidad en formulario apertura cuenta corriente
    And Presiono boton CONTINUAR  en formulario apertura cuenta corriente

    Then Visualizo el titulo del mensaje en formulario apertura cuenta corriente

              """
              Al parecer ya iniciaste una solicitud
              """

    And Visualizo la descripcion del mensaje en formulario apertura cuenta corriente

              """
              Según nuestros registros ya tienes una solicitud en curso. Te invitamos a retomar el proceso ingresando tu código de seguimiento
              """

    And Visualizo el boton RETOMAR en formulario apertura cuenta corriente