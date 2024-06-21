package seleniungluecode;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MasTests extends TestBase{


    @Given("Presiono boton BANCO EN LINEA en home del sitio BCI portal Personas")
    public void presionoBotonBANCOENLINEAEnHomeDelSitioBCIPortalPersonas() {
        homePage.seleccionarBancaEnLinea();
    }


    @When("Ingreso en el campo Rut el valor {string} en formulario de inicio de sesion")
    public void ingresoEnElCampoRutElValorEnFormularioDeInicioDeSesion(String string) {
        loginPage.ingresarRut(string);
    }
    @When("Ingreso en el campo Clave el valor {string} en formulario de inicio de sesion")
    public void ingresoEnElCampoClaveElValorEnFormularioDeInicioDeSesion(String string) {
        loginPage.ingresarClave(string);
    }
    @When("Presiono boton CONTINUAR  en formulario de inicio de sesion")
    public void presionoBotonCONTINUAREnFormularioDeInicioDeSesion() {
        loginPage.iniciarSesion();
    }

    @Then("Visualizo el titulo del mensaje en formulario de inicio de sesion")
    public void visualizoElTituloDelMensajeEnFormularioDeInicioDeSesion(String docString) {
        Assert.assertEquals(docString,loginPage.obtenerTituloErrorLogin());
    }
    @Then("Visualizo la descripcion del mensaje en formulario de inicio de sesion")
    public void visualizoLaDescripcionDelMensajeEnFormularioDeInicioDeSesion(String docString) {
        Assert.assertEquals(docString,loginPage.obtenerDescripcionErrorLogin());
    }



    @Given("Los siguientes usuarios existentes")
    public void losSiguientesUsuariosExistentes(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsSinEncabezado = rows.subList(1,rows.size());

        System.out.println("Datos Usuarios");
        System.out.println("-----------------------------------------------");
        for(List<String> row : rowsSinEncabezado){
            System.out.println("Usuario: "+ row.get(0)+ " , Password: "+ row.get(1));
        }
    }

    @Then("Visualizo el titulo  {string} en formulario de inicio de sesion")
    public void visualizoElTituloEnFormularioDeInicioDeSesion(String string) {
       Assert.assertEquals(string,loginPage.obtenerTituloErrorLogin());
    }

    @Then("Visualizo la descripcion {string} en formulario de inicio de sesion")
    public void visualizoLaDescripcionEnFormularioDeInicioDeSesion(String string) {
        Assert.assertEquals(string,loginPage.obtenerDescripcionErrorLogin());
    }
}
