package seleniungluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.HomePage;
import pom.LoginPage;
import pom.PlanCtaCtePage;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();
    protected WebDriverWait wait = Hooks.getWaitDriver();
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected PlanCtaCtePage planCtaCtePage = PageFactory.initElements(driver, PlanCtaCtePage.class);

    protected LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
}
