package com.bamburov.steps;

import com.bamburov.pageObjects.CartPage;
import com.bamburov.pageObjects.HomePage;
import io.qameta.allure.Step;

public class CartPageSteps extends BaseSteps {
    private CartPage cartPage;

    public CartPageSteps() {
        cartPage = new CartPage();
    }

    @Step("Do - Browser - Cart Page - Check Presence of '{productName}' Product")
    public void checkProductPresence(String productName) {
        cartPage.checkProductPresence(productName);
    }

    @Step("Do - Browser - Cart Page - Click 'Proceed to checkout'")
    public void clickProceedToCheckout() {
        cartPage.clickProceedToCheckout();
    }
}
