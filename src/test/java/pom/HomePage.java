package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ClaseBase;

public class HomePage extends ClaseBase {
    //Localizadores
    private String title = "Bci Personas | Banco Bci";
    @FindBy(xpath="//button[contains(text(),'Hazte Cliente')]")
    WebElement locatorBtnHazteCliente;

    @FindBy(xpath="//a[contains(text(),'Banco en')]")
    WebElement btnBancoEnLinea;

    @FindBy(xpath="//button[contains(text(),'Abrir plan cuenta corriente')]")
    WebElement locatorAbrirPlanCtaCorriente;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarHazteCliente(){
        click(esperaExplicita(locatorBtnHazteCliente));
        esperarXSegundos(1000);

    }
    public void seleccionarAbrirCtaCte(){
        click(esperaExplicita(locatorAbrirPlanCtaCorriente));
        esperarXSegundos(1000);

    }

    public void seleccionarBancaEnLinea(){
        click(esperaExplicita(btnBancoEnLinea));
        esperarXSegundos(1000);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
