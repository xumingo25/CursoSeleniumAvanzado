package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;

public class ClaseBase {
	//La clase base centraliza todo lo que hacemos 
	//con las librerias de selenium (Wrapper)
	
	//Atributos
	protected WebDriver driver;
	protected WebDriverWait espera;
	
	//M�todos
	public ClaseBase(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	//Accesadores y Mutadores
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriverWait getEspera() {
		return espera;
	}

	public void setEspera(WebDriverWait espera) {
		this.espera = espera;
	}
	
	
	//Centralizar las acciones en el browser
	
	//buscar elemento web por locator
	public WebElement buscarElementoWeb(By localizador) {
		return this.driver.findElement(localizador);
	}
	
	//buscar elementos web por locator
	public List<WebElement> buscarElementosWeb(By localizador) {
		return this.driver.findElements(localizador);
	}
	

	//ingresar datos en imput
	public void agregarTexto(By localizador,String texto) {
		this.driver.findElement(localizador).sendKeys(texto);
	}
	
	public void agregarTexto(WebElement elemento,String texto) {
		elemento.sendKeys(texto);
	}
	
	//click
	public void click(By localizador) {
		this.driver.findElement(localizador).click();
	}
	
	public void click(WebElement elemento) {
		elemento.click();
	}
	
	public void cargarURL(String url) {
		this.driver.get(url);
	}

	
	public boolean estaDesplegado(WebElement elemento) {
		if(elemento.isDisplayed()){
			return true;
		}else {
			return false;
		}
	}

	public boolean estaDesplegado(By localizador) {
		if(driver.findElement(localizador).isDisplayed()){
			return true;
		}else {
			return false;
		}
	}
	
	public boolean estaHabilitado(WebElement elemento) {
		if(elemento.isEnabled()){
			return true;
		}else {
			return false;
		}
	}
	
	public void maximizarBrowser() {
		this.driver.manage().window().maximize();
	}
	
	public String obtenerTexto(By localizador) {
		return this.driver.findElement(localizador).getText();
	}
	
	public String obtenerTexto(WebElement elemento) {
		return elemento.getText();
	}
	
	
	public void irAFramePorID(WebElement elemento) {
		this.driver.switchTo().frame(elemento);
	}

	
	public void esperarXSegundos(int milisegundos) {
		try {
			Thread.sleep(milisegundos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebElement esperaExplicita(WebElement element){
		espera = new WebDriverWait(this.driver, 20);

		return espera.until(ExpectedConditions.visibilityOf(element));
	}


	public WebElement esperaExplicita(By localizador) {
		//espera = new WebDriverWait(this.driver, 20);
		
		return espera.until(ExpectedConditions.presenceOfElementLocated(localizador));
	}
	
	public int contarFrames() {
		return this.driver.findElements(By.xpath("//iframe")).size();
	}
	
	public void irAframe(int nroFrame) {
		this.driver.switchTo().frame(nroFrame);
	}
	
	public void scrolling(WebElement elemento){
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", elemento);
	}

	public void agregarCombinacionTeclas(Keys keys){
		Actions a = new Actions(driver);
		a.sendKeys(keys).build().perform();
	}

}
