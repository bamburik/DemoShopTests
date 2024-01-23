package com.bamburov.steps;

import com.bamburov.pageObjects.BasePage;

public class BaseSteps {
    protected BasePage page;

    public BaseSteps() {
        page = new BasePage();
    }

    protected void search(String productName) {
        page.search(productName);
    }
}
