package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage  {

    private SelenideElement
    emptyCartText = $ ("h2.cart__subtitle"),
    cart = $("a[href='/cart/?from=top']");



    @Step("Проверяем, что корзина пуста")
    public BasketPage emptyCart() {
        cart.click();
        emptyCartText.shouldHave(text("Корзина ждет, что ее наполнят. Желаем приятных покупок!"));
        return this;
    }
}
