package com.bamburov.steps;

import com.bamburov.pageObjects.SearchResultsPage;
import io.qameta.allure.Step;

public class SearchResultsSteps {
    private SearchResultsPage searchResultsPage;

    public SearchResultsSteps() {
        searchResultsPage = new SearchResultsPage();
    }

    @Step("Do - Browser - Search Results Page - Click on 1st Product")
    public void clickOnFirstProduct() {
        searchResultsPage.clickOnFirstProduct();
    }
}
