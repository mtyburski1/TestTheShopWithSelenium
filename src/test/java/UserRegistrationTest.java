import base.Pages;
import models.User;
import models.UserFactory;
import models.managers.Genders;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest extends Pages {
    @Test
    public void shouldRegisterSuccessfully(){
        User user = UserFactory.getRandomUser();

        mainPage
                .goToAccount()
                .registerClick()
                .setGender(Genders.MR)
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setEmail(user.getEmail())
                .setPassword(user.getPassword())
                .optinClick(user.isOffersEmailCheck())
                .custPrivacyClick(user.isPrivacyCheck())
                .newsletterClick(user.isNewsletterCheck())
                .psgdprClick(user.isPsgdprCheck())
                .saveRegisterClick();
        Assert.assertEquals(user.getFirstName() + " " + user.getLastName(), mainPage.getNameText());




    }
}
