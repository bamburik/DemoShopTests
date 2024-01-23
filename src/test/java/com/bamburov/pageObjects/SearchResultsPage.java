package com.bamburov.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {
    private SelenideElement firstProductLink = $(".product a.product-thumbnail");

    public void clickOnFirstProduct() {
        firstProductLink.click();
    }
}
