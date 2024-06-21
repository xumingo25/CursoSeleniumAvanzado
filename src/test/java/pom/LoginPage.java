package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ClaseBase;

public class LoginPage extends ClaseBase {

    @FindBy(id="rut_aux")
    WebElement txtRut;

    @FindBy(id="clave")
    WebElement txtClave;

    @FindBy(xpath="//button[contains(text(),'Ingresar')]")
    WebElement btnIngresar;

    @FindBy(xpath="//h1[contains(text(),'Recupera tu clave')]")
    WebElement lblTituloErrorLogin;

    @FindBy(xpath="//p[contains(text(),'Recupera el acceso')]")
    WebElement lblDescErrorLogin;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarRut(String rut){
        esperarXSegundos(1000);
        agregarTexto(esperaExplicita(txtRut),rut);
    }

    public void ingresarClave(String clave){
        esperarXSegundos(1000);
        agregarTexto(esperaExplicita(txtClave),clave);
    }
    public void iniciarSesion(){
        click(esperaExplicita(btnIngresar));
    }

    public String obtenerTituloErrorLogin(){
        return obtenerTexto(esperaExplicita(lblTituloErrorLogin));
    }

    public String obtenerDescripcionErrorLogin(){
        return obtenerTexto(esperaExplicita(lblDescErrorLogin));
    }

}
