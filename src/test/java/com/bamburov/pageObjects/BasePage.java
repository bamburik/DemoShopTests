package com.bamburov.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    private SelenideElement searchInput = $("#search_widget input[type=text]");

    public void search(String productName) {
        searchInput.sendKeys(productName);
        searchInput.pressEnter();
    }
}
