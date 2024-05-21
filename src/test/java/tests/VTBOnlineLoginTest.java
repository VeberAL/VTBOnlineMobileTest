package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.PolicyPage;

public class VTBOnlineLoginTest extends TestBase {

    PolicyPage policyPage = new PolicyPage();
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Test
    @DisplayName("Проверка отображения поля для ввода данных пользователя.")
    void successfulSearchTest() {
        policyPage.clickPolicyButton();
        mainPage.clickEnterButton();
        loginPage.checkLoginField();
    }
}