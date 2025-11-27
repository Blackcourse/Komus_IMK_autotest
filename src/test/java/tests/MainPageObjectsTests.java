package tests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import pages.BasketPage;
import pages.MainPageElements;
import pages.MainPage;



public class MainPageObjectsTests extends TestBase {

    MainPage mainPage = new MainPage();
    MainPageElements mainPageElements = new MainPageElements();
    BasketPage basketPage = new BasketPage();


    @Test
    @DisplayName("Проверка отображения главной страницы")
    @Tag("MainPageTests")
    void positiveMainPageIsVisible() {
        mainPage.openPage();
        mainPageElements.checkMainPageIsOpen();
    }

    @Test
    @DisplayName("Проверка доступности  окна поиска товаров")
    @Tag("MainPageTests")
    void searchFormOnMainPage() {
        mainPage.openPage();
        mainPageElements.checkSearchInputIsVisible();

    }


    @Test
    @DisplayName("Проверка доступности поиска принтеров")
    @Tag("MainPageTests")
    void searchPrinters() {
        mainPage.openPage();
        mainPageElements.searchPrinters();
    }

    @Test
    @DisplayName("Проверка пустой корзины")
    @Tag("MainPageTests")
    void emptyCart() {
        mainPage.openPage();
        basketPage.emptyCart();
    }


        @Test
        @DisplayName("Проверка отображения элемента для подбора картриджей")
        @Tag("MainPageTests")
        void suppliesPickerIsVisible () {
            mainPage.openPage();
            mainPageElements.suppliesPickerIsVisible();

        }


    }










