package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class MainPage {

    private final SelenideElement enterButton = $(id("ru.vtb24.mobilebanking.android:id/alternativeButton"));

    @Step("Нажатие кнопки 'Войти'")
    public void clickEnterButton() {
        enterButton.click();
    }
}