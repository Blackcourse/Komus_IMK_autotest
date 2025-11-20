package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.BDDAssertions.and;


public class CheckComponent {

    private SelenideElement komusHeader = $(By.id("top-subHeader")),
            searchInput = $(".v-input__field"),
            suppliesPicker = $ (".supplies-picker__header"),
            cart = $("a[href='/cart/?from=top']"),
            emptyCartText = $ ("h2.cart__subtitle");
            ElementsCollection searchResult = $$(".product-list-wrapper");




    public CheckComponent checkMainPageIsOpen() {
        komusHeader.shouldBe(visible);
        return this;
    }

    public CheckComponent checkSearchInputIsVisible() {
        searchInput.shouldBe(visible);

        return this;
    }

    public CheckComponent searchPrinters() {
        searchInput.click();
        searchInput.sendKeys("Принтеры");
        searchInput.sendKeys(Keys.ENTER);
        searchResult.shouldHave(sizeGreaterThan(0));

        return this;
    }

        public CheckComponent emptyCart() {
        cart.click();
        emptyCartText.shouldHave(text("Корзина ждет, что ее наполнят. Желаем приятных покупок!"));
            return this;
        }

        public CheckComponent suppliesPickerIsVisible () {
            suppliesPicker.shouldHave(text("Подбор картриджей"));

            return this;
        }

    }


