package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class MainPageElements {

    private SelenideElement komusHeader = $(By.id("top-subHeader")),
            searchInput = $(".v-input__field"),
            suppliesPicker = $ (".supplies-picker__header"),
            emptyCartText = $ ("h2.cart__subtitle");
            ElementsCollection searchResult = $$(".product-list-wrapper");


            @Step ("Отображается главная страница сайта")
    public MainPageElements checkMainPageIsOpen() {
        komusHeader.shouldBe(visible);
        return this;
    }

          @Step ("Находим окно поиска товаров")
    public MainPageElements checkSearchInputIsVisible() {
        searchInput.shouldBe(visible);

        return this;
    }
    @Step ("Находим принтеры через окно поиска")
    public MainPageElements searchPrinters() {
        searchInput.click();
        searchInput.sendKeys("Принтеры");
        searchInput.sendKeys(Keys.ENTER);
        searchResult.shouldHave(sizeGreaterThan(0));

        return this;
    }

    @Step ("Проверяем, что доступен виджет поиска картриджей")
        public MainPageElements suppliesPickerIsVisible () {
            suppliesPicker.shouldHave(text("Подбор картриджей"));

            return this;
        }

    }


