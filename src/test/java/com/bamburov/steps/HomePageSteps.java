package com.bamburov.steps;

import com.bamburov.pageObjects.HomePage;
import io.qameta.allure.Step;

public class HomePageSteps extends BaseSteps {
    private HomePage homePage;

    public HomePageSteps() {
        homePage = new HomePage();
    }

    @Step("Do - Browser - Home Page - Search '{productName}'")
    public void search(String productName) {
        super.search(productName);
    }
}
