package com.bamburov.pageObjects;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {
    private SelenideElement loadLabel = $("#loadingMessage");

    public void waitPageForLoad() {
        loadLabel.shouldHave(cssValue("display", "none"), Duration.of(30, ChronoUnit.SECONDS));
    }
}
