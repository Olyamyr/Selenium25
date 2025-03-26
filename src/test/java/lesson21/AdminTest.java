package lesson21;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tastPages.AdminPage;
import tastPages.LoginPage;

import static com.codeborne.selenide.Selenide.$;

public class AdminTest extends BaseTest {

    @Test
    public void searchAdmin() {
    app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);

    app.adminPage.adminTab.click();
    app.adminPage.usernameField.setValue("admin");
    app.adminPage.searchButton.click();
    }
}