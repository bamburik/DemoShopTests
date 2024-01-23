package com.bamburov.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CartPage extends BasePage {
    private SelenideElement proceedToCheckoutButton = $(".checkout a");

    public void checkProductPresence(String productName) {
        getProductWebElementByName(productName).shouldBe(visible);
    }

    public void clickProceedToCheckout() {
        proceedToCheckoutButton.click();
    }

    private SelenideElement getProductWebElementByName(String name) {
        return $x(String.format("//li[contains(@class, 'cart-item') and .//a[text()='%s']]", name));
    }
}
