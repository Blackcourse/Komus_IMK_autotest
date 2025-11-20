package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class CheckComponent {

    private SelenideElement komusHeader = $(By.id("top-subHeader")),
            newYearCard = $(".base-slider banner-slider__swiper-container"),
            searchInput = $(".v-input__field"),
            changeRegion = $ (".qa-choose-region"),
            moscowOblchange = $ (".qa-region-item.b-region__list__item--current").shouldHave(text("Московская область"));
            ElementsCollection searchResult = $$(".product-list-wrapper");



    public CheckComponent checkMainPageIsOpen() {
        komusHeader.shouldBe(visible);
        return this;
    }

    public CheckComponent checkNewYearCardIsVisible() {
        newYearCard.shouldBe(visible);

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
        searchResult.shouldHave(CollectionCondition.sizeGreaterThan(0));

        return this;
    }

        public CheckComponent changeRegion() {
            changeRegion.click();
            moscowOblchange.click();

            return this;
        }

    }


