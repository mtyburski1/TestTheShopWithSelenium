package base;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import pages.AccountPage;
import pages.MainPage;
import pages.RegisterPage;

public class Pages extends BaseTest {
    protected MainPage mainPage;
    protected AccountPage accountPage;
    protected RegisterPage registerPage;

    @BeforeMethod
    public void pagesSetup() {

        mainPage = new MainPage(driver);
        accountPage = new AccountPage(driver);
        registerPage = new RegisterPage(driver);
    }
}
