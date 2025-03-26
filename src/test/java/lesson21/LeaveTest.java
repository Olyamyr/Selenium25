package lesson21;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LeaveTest extends BaseTest{

    @Test
    public void invalidEmployeeNameSearch() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.leavePage.leaveTab.click();
        app.leavePage.employeeNameField.setValue("23456");
        app.leavePage.employeeNameField.shouldBe(Condition.exactValue("23456"));
        app.leavePage.employeeNameField.clear();
        app.leavePage.searchButton.click();
        app.leavePage.errorMessage.shouldBe(Condition.exist);
        app.leavePage.errorMessage.shouldBe(Condition.visible);
    }
}
