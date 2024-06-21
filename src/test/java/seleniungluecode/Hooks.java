package seleniungluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ClaseBase;
import utils.driverManager.DriverManager;
import utils.driverManager.DriverManagerFactory;
import utils.driverManager.DriverType;

public class Hooks {
    private static WebDriver driver;
    private static WebDriverWait wait;

    private DriverManager driverManager;

    public static int numeroDeCaso = 0;

    @Before
    public void setUp(){
        numeroDeCaso++;
        System.out.println("Se esta ejecutando el escenario nro: "+ numeroDeCaso);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        wait = new WebDriverWait(driver,10);
        driver.get("https://www.bci.cl/personas");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
        byte[] screenShot;
        if(scenario.isFailed()){
           screenShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
           scenario.attach(screenShot,"image/png",scenario.getName());
           scenario.log("Fallo el step del escenario");
        }else{
            screenShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png",scenario.getName());
            scenario.log("Escenario OK");
        }
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriverWait getWaitDriver(){
        return wait;
    }
}
