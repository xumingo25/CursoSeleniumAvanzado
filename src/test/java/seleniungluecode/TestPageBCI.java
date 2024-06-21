package seleniungluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.HomePage;
import pom.PlanCtaCtePage;

public class TestPageBCI extends TestBase{

    @Given("^Estoy en el Sitio de BCI portal Personas$")
    public void estoy_en_el_Sitio_de_BCI_portal_Personas() throws Throwable {
        Assert.assertEquals(homePage.getTitle(),driver.getTitle());
    }

    @Given("^Presiono boton HAZTE CLIENTE en home del sitio BCI portal Personas$")
    public void presiono_boton_HAZTE_CLIENTE_en_home_del_sitio_BCI_portal_Personas() throws Throwable {
        homePage.seleccionarHazteCliente();
    }

    @Given("^Presiono boton ABRIR PLAN CUENTA CORRIENTE en home del sitio BCI portal Personas$")
    public void presiono_boton_ABRIR_PLAN_CUENTA_CORRIENTE_en_home_del_sitio_BCI_portal_Personas() throws Throwable {
        homePage.seleccionarAbrirCtaCte();

    }

    @When("^Ingreso en el campo Nombre el valor \"([^\"]*)\" en formulario apertura cuenta corriente$")
    public void ingreso_en_el_campo_Nombre_el_valor_en_formulario_apertura_cuenta_corriente(String arg1) throws Throwable {
        planCtaCtePage.ingresarNombre(arg1);

    }

    @When("^Ingreso en campo ApellidoPaterno el valor \"([^\"]*)\" en formulario apertura cuenta corriente$")
    public void ingreso_en_campo_ApellidoPaterno_el_valor_en_formulario_apertura_cuenta_corriente(String arg1) throws Throwable {
        planCtaCtePage.ingresarApellidoP(arg1);
    }

    @When("^Ingreso en campo ApellidoMaterno el valor \"([^\"]*)\" en formulario apertura cuenta corriente$")
    public void ingreso_en_campo_ApellidoMaterno_el_valor_en_formulario_apertura_cuenta_corriente(String arg1) throws Throwable {
        planCtaCtePage.ingresarApellidoM(arg1);
    }

    @When("^Ingreso en campo Rut el valor \"([^\"]*)\"  en formulario apertura cuenta corriente$")
    public void ingreso_en_campo_Rut_el_valor_en_formulario_apertura_cuenta_corriente(String arg1) throws Throwable {
        planCtaCtePage.ingresarRut(arg1);
    }

    @When("^Ingreso en campo TelefonoCelular el valor \"([^\"]*)\" en formulario apertura cuenta corriente$")
    public void ingreso_en_campo_TelefonoCelular_el_valor_en_formulario_apertura_cuenta_corriente(String arg1) throws Throwable {
        planCtaCtePage.ingresarTelefono(arg1);
    }

    @When("^Ingreso en campo Correo el valor \"([^\"]*)\" en formulario apertura cuenta corriente$")
    public void ingreso_en_campo_Correo_el_valor_en_formulario_apertura_cuenta_corriente(String arg1) throws Throwable {
        planCtaCtePage.ingresarCorreo(arg1);

    }

    @When("^Selecciono casilla de confirmacion de captcha en formulario apertura cuenta corriente$")
    public void selecciono_casilla_de_confirmacion_de_captcha_en_formulario_apertura_cuenta_corriente() throws Throwable {
        planCtaCtePage.agregarCombinacionTeclas(Keys.PAGE_DOWN);
        planCtaCtePage.esperarXSegundos(15000);
    }

    @When("^Selecciono casilla de confirmacion de poliza privacidad en formulario apertura cuenta corriente$")
    public void selecciono_casilla_de_confirmacion_de_poliza_privacidad_en_formulario_apertura_cuenta_corriente() throws Throwable {
        planCtaCtePage.seleccionarCheckprivacidad();
    }

    @When("^Presiono boton CONTINUAR  en formulario apertura cuenta corriente$")
    public void presiono_boton_CONTINUAR_en_formulario_apertura_cuenta_corriente() throws Throwable {
        planCtaCtePage.continuarSolicitud();
    }

    @Then("^Visualizo el titulo del mensaje en formulario apertura cuenta corriente$")
    public void visualizo_el_titulo_del_mensaje_en_formulario_apertura_cuenta_corriente(String arg1) throws Throwable {
        planCtaCtePage.agregarCombinacionTeclas(Keys.PAGE_UP);
        planCtaCtePage.agregarCombinacionTeclas(Keys.PAGE_UP);
        Assert.assertEquals(arg1,planCtaCtePage.obtenerTituloSolicitudRealizada());
    }

    @Then("^Visualizo la descripcion del mensaje en formulario apertura cuenta corriente$")
    public void visualizo_la_descripcion_del_mensaje_en_formulario_apertura_cuenta_corriente(String arg1) throws Throwable {
        Assert.assertEquals(arg1,planCtaCtePage.obtenerDescripcionSolicitudRealizada());
    }

    @Then("^Visualizo el boton RETOMAR en formulario apertura cuenta corriente$")
    public void visualizo_el_boton_RETOMAR_en_formulario_apertura_cuenta_corriente() throws Throwable {
        Assert.assertTrue(planCtaCtePage.validarBtnRetomar());
    }


}
