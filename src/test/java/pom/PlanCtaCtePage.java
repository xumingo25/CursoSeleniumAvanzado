package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ClaseBase;

public class PlanCtaCtePage extends ClaseBase {
    //Localizadores
    @FindBy(xpath="//body/div[@id='main-layout']/section[2]/div[1]/div[1]/div[1]/iframe[1]")
    WebElement locatorFrameFormulario;

    @FindBy(xpath="//input[@id='names']")
    WebElement locatorInputNombre;

    @FindBy(id="apellidoPaterno")
    WebElement locatorInputApellidoP;
    @FindBy(id="apellidoMaterno")
    WebElement locatorInputApellidoM;
    @FindBy(name="rut")
    WebElement locatorInputRut;

    @FindBy(id="selectPoliza")
    WebElement locatorInputTelefono;

    @FindBy(id="correoElectronico")
    WebElement locatorInputCorreo;

    @FindBy(id="checkPrivacidad")
    WebElement locatorChkPrivacidad;

    @FindBy(id="botonOculto")
    WebElement locatorBtnContinuar;

    @FindBy(xpath="//p[contains(text(),'Al parecer ya iniciaste una solicitud')]")
    WebElement locatorTituloSolicitudIngresada;

    @FindBy(xpath="//p[contains(text(),'Según nuestros registros ya tienes una solicitud e')]")
    WebElement locatorLabelSolicitudIngresada;
    @FindBy(xpath="//button[contains(text(),'RETOMAR')]")
    WebElement locatorBtnRetomar;

    public PlanCtaCtePage(WebDriver driver) {
        super(driver);
    }

    public void ingresarNombre(String nombre){
        esperarXSegundos(1000);
        irAFramePorID(esperaExplicita(locatorFrameFormulario));
        agregarTexto(esperaExplicita(locatorInputNombre),nombre);
    }
    public void ingresarApellidoP(String apellidoP){
        esperarXSegundos(1000);
        agregarTexto(esperaExplicita(locatorInputApellidoP),apellidoP);
    }

    public void ingresarApellidoM(String apellidoM){
        esperarXSegundos(1000);
        agregarTexto(esperaExplicita(locatorInputApellidoM),apellidoM);
    }

    public void ingresarRut(String rut){
        esperarXSegundos(1000);
        agregarTexto(esperaExplicita(locatorInputRut),rut);
    }

    public void ingresarTelefono(String telefono){
        esperarXSegundos(1000);
        agregarTexto(esperaExplicita(locatorInputTelefono),telefono);
    }

    public void ingresarCorreo(String correo){
        esperarXSegundos(1000);
        agregarTexto(esperaExplicita(locatorInputCorreo),correo);
    }

    public String obtenerTituloSolicitudRealizada(){
        return obtenerTexto(esperaExplicita(locatorTituloSolicitudIngresada));
    }

    public String obtenerDescripcionSolicitudRealizada(){
        return obtenerTexto(esperaExplicita(locatorLabelSolicitudIngresada));
    }

    public void seleccionarCheckprivacidad(){
        click(esperaExplicita(locatorChkPrivacidad));
    }

    public void continuarSolicitud(){
        click(esperaExplicita(locatorBtnContinuar));
    }

    public boolean validarBtnRetomar(){
        return estaDesplegado(esperaExplicita(locatorBtnRetomar));
    }


}
