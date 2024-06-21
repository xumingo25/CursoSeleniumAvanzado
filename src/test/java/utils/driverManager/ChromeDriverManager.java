package utils.driverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import utils.PropertiesDriven;

public class ChromeDriverManager extends DriverManager{

    @Override
    protected void createDriver() {
        System.setProperty(PropertiesDriven.obtenerProperty("propertyDriver"),PropertiesDriven.obtenerProperty("rutaDriver"));
        driver = new ChromeDriver();
    }
}
