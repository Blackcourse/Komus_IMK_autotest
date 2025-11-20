package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;


public class MainPage {

    @Step("Открыть главную страницу {baseUrl}")
    public void openPage() {
        open("https://www.komus.ru/");
    }




}