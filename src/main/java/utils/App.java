package utils;

import tastPages.AdminPage;
import tastPages.BasePage;
import tastPages.LeavePage;
import tastPages.LoginPage;

public class App extends BasePage {
    public LoginPage loginPage = new LoginPage();
    public AdminPage adminPage = new AdminPage();
    public UserCredentials userCreds = new UserCredentials();
    public LeavePage leavePage = new LeavePage();
}
