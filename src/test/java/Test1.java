import base.BaseTest;
import org.testng.annotations.Test;

public class Test1 extends BaseTest {
    @Test
    public void shouldTest(){

        driver.get("www.google.pl");
    }
}
