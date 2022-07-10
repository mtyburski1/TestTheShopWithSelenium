package pages;

import com.mifmif.common.regex.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#contact-link")
    private WebElement contactBtn;

    @FindBy(css = "#_desktop_logo")
    private WebElement logoBtn;

    @FindBy(css = "#category-3")
    private WebElement clothesBtn;

    @FindBy(css = "#category-6")
    private WebElement accessoriesBtn;

    @FindBy(css = "#category-9")
    private WebElement artBtn;

    @FindBy(xpath = "//span[contains(text(), 'Sign in')]")
    private WebElement signInBtn;

    @FindBy(css = " a  span.hidden-sm-down")
    private WebElement nameText;

    public String getNameText(){
        return nameText.getText();
    }

    public AccountPage goToAccount(){
        click(signInBtn);
        return new AccountPage(driver);
    }


    public MainPage goToArt(){
        click(artBtn);
        return this;
    }


    public MainPage goToAccessiories(){
        click(accessoriesBtn);
        return this;
    }

    public MainPage goToClothes(){
        click(clothesBtn);
        return this;
    }

    public MainPage logoClick(){
        click(logoBtn);
        return this;
    }

    public MainPage goToContact(){
        click(contactBtn);
        return this;
    }


}