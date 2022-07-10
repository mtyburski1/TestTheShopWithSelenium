package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "//a[contains(text(),'No account')]")
    private WebElement registerBtn;

    public RegisterPage registerClick () {
        click(registerBtn);
        return new RegisterPage(driver);
    }
}
