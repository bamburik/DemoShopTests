package com.bamburov.steps;

import com.bamburov.pageObjects.CartPage;
import com.bamburov.pageObjects.CheckoutPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;

public class CheckoutPageSteps extends BaseSteps {
    private CheckoutPage checkoutPage;

    public CheckoutPageSteps() {
        checkoutPage = new CheckoutPage();
    }

    @Step("Do - Browser - Checkout Page - Check 'Personal Information' block is present")
    public void checkPersonalInfoBlockPresence() {
        checkoutPage.checkPersonalInfoBlockPresence();
    }
}
