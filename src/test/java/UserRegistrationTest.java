import models.User;
import models.UserFactory;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    @Test
    public void shouldRegister(){
        User user = UserFactory.getRandomUser();

    }
}
