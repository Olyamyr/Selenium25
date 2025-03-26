package lesson21;

import org.testng.annotations.BeforeTest;
import utils.App;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    App app = new App();

    @BeforeTest
    public void setup() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
