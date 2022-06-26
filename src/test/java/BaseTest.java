import models.managers.factory.DriverFactory;
import models.propety_load.PropertiesLoad;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new DriverFactory().getDriver(PropertiesLoad.loadAPropetyFile("chromeDriver"));

        driver.get(PropertiesLoad.loadAPropetyFile("mainPage"));
    }
}
