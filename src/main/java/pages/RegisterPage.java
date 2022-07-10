package pages;

import models.managers.Genders;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='id_gender']")
    private List<WebElement> gendersRadio;

    @FindBy(css = "input[name='firstname']")
    private WebElement firstNameInput;

    @FindBy(css = "input[name='lastname']")
    private WebElement lastNameInput;

    @FindBy(css = "input[name='email']")
    private WebElement emailInput;

    @FindBy(css = "input[name='password']")
    private WebElement passwordInput;

    @FindBy(css = "input[name='optin']")
    private WebElement optinCheckbox;

    @FindBy(css = "input[name='customer_privacy']")
    private WebElement customerPrivacyCheckbox;

    @FindBy(css = "input[name='newsletter']")
    private WebElement newsletterCheckbox;

    @FindBy(css = "input[name='psgdpr']")
    private WebElement psgdprCheckbox;

    @FindBy(css = "footer button.btn-primary")
    private WebElement saveRegisterBtn;

    public RegisterPage saveRegisterClick(){
        click(saveRegisterBtn);
        return this;
    }

    public RegisterPage psgdprClick(boolean choice){
        if(choice){
            click(psgdprCheckbox);
        }
        return this;
    }

    public RegisterPage newsletterClick(boolean choice){
        if(choice){
            click(newsletterCheckbox);
        }
        return this;
    }

    public RegisterPage custPrivacyClick(boolean choice) {
        if (choice) {
            click(customerPrivacyCheckbox);
        }
        return this;
    }

    public RegisterPage optinClick(boolean choice) {
        if (choice) {
            click(optinCheckbox);
        }
        return this;
    }

    public RegisterPage setPassword(String password) {
        sendKeys(passwordInput, password);
        return this;
    }

    public RegisterPage setEmail(String email) {
        sendKeys(emailInput, email);
        return this;
    }

    public RegisterPage setLastName(String lastName) {
        sendKeys(lastNameInput, lastName);
        return this;
    }

    public RegisterPage setGender(Genders gender) {  // MR, MS
        if (gender.toString().equals("mr"))
            gendersRadio.get(0).click();
        else if (gender.toString().equals("ms")) {
            gendersRadio.get(1).click();
        }
        return this;
    }

    public RegisterPage setFirstName(String firstName) {
        sendKeys(firstNameInput, firstName);
        return this;

    }
}
