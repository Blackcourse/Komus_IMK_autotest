package tests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import pages.CheckComponent;
import pages.MainPage;



public class MainPageObjectsTests extends TestBase {

    MainPage mainPage = new MainPage();
    CheckComponent checkComponent = new CheckComponent();


    @Test
    @DisplayName("Проверка отображения главной страницы")
    @Tag("MainPageTests")
    void positiveMainPageIsVisible() {
        mainPage.openPage();
        checkComponent.checkMainPageIsOpen();
    }

    @Test
    @DisplayName("Проверка доступности  окна поиска товаров")
    @Tag("MainPageTests")
    void searchFormOnMainPage() {
        mainPage.openPage();
        checkComponent.checkSearchInputIsVisible();

    }


    @Test
    @DisplayName("Проверка доступности поиска принтеров")
    @Tag("MainPageTests")
    void searchPrinters() {
        mainPage.openPage();
        checkComponent.searchPrinters();
    }








}









