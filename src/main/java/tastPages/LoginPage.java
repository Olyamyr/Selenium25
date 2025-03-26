package tastPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement usernameField = $(By.xpath("//input[@name='username']"));
    public SelenideElement passwordField = $(By.xpath("//input[@name='password']"));
    public SelenideElement loginButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement errorMessage = $(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']"));

    public void login(String login, String password) {
        usernameField.setValue(login);
        usernameField.shouldHave(Condition.exactValue(login));
        passwordField.setValue(password);
        passwordField.shouldHave(Condition.exactValue(password));
        loginButton.click();
    }

}
