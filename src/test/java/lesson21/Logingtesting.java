package lesson21;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tastPages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Logingtesting extends BaseTest {

    LoginPage loginPage = new LoginPage();

    //Авторизация
    @Test
    public void loginValidCreads() {
        loginPage.usernameField.setValue("Admin");
        loginPage.usernameField.shouldHave(Condition.exactValue("Admin"));
        //usernameField.sendKeys("Admin");
        loginPage.passwordField.setValue("admin123");
        loginPage.passwordField.shouldHave(Condition.exactValue("admin123"));
        loginPage.loginButton.click();
    }

    public void loginInvalidCreads() {
        loginPage.usernameField.setValue("Admin");
        loginPage.usernameField.shouldHave(Condition.exactValue("Admin"));
        loginPage.passwordField.setValue("admin");
        loginPage.passwordField.shouldHave(Condition.exactValue("admin"));
        loginPage.loginButton.click();
        loginPage.errorMessage.shouldBe(Condition.visible);
        loginPage.errorMessage.shouldHave(Condition.exactText("Invalid credentials"));
        loginPage.usernameField.shouldBe(Condition.empty);
        loginPage.passwordField.shouldBe(Condition.empty);
    }
}
