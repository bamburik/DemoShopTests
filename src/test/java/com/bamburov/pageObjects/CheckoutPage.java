package com.bamburov.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage extends BasePage {
    private SelenideElement personalInfoBlock = $("#checkout-personal-information-step");

    public void checkPersonalInfoBlockPresence() {
        personalInfoBlock.shouldBe(visible);
    }
}
