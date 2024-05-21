package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class PolicyPage {

    private final SelenideElement policyButtonOk = $(id("ru.vtb24.mobilebanking.android:id/mainButton"));
    @Step("Нажатие кнопки согласия с политикой приложения.")
    public void clickPolicyButton() {
        policyButtonOk.click();
    }
}