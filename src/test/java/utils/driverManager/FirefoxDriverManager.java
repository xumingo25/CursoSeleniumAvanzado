package utils.driverManager;

import org.openqa.selenium.firefox.FirefoxDriver;
import utils.PropertiesDriven;

public class FirefoxDriverManager extends DriverManager{

    @Override
    protected void createDriver() {
        System.setProperty(PropertiesDriven.obtenerProperty("propertyDriverFirefox"),PropertiesDriven.obtenerProperty("rutaDriverFirefox"));
        driver = new FirefoxDriver();
    }
}
