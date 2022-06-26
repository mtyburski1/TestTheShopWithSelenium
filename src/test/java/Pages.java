import org.testng.annotations.BeforeMethod;
import pages.MainPage;

public class Pages extends BaseTest {
    MainPage mainPage;
    
    @BeforeMethod
    public void pagesSetup() {
        mainPage = new MainPage(driver);
    }
}
