package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.className;

public class LoginPage {

    private final SelenideElement loginField = $(className("android.widget.EditText"));

    @Step("Проверка существования поля для ввода данных пользователя.")
    public void checkLoginField() {
        loginField.should(exist);
    }
}