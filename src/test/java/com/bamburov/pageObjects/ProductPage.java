package com.bamburov.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ProductPage extends BasePage {
    private SelenideElement addToCartButton = $(".add-to-cart");

    private SelenideElement continueShoppingButton = $x("//button[@type='button' and .='Continue shopping']");

    private SelenideElement proceedToCheckoutButton = $x("//a[text()='Proceed to checkout']");

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public void clickContinueShopping() {
        continueShoppingButton.click();
    }

    public void clickProceedToCheckout() {
        proceedToCheckoutButton.click();
    }
}
