package com.bamburov.steps;

import com.bamburov.pageObjects.ProductPage;
import io.qameta.allure.Step;

public class ProductPageSteps extends BaseSteps {
    private ProductPage productPage;

    public ProductPageSteps() {
        productPage = new ProductPage();
    }

    @Step("Do - Browser - Product Page - Click Add To Cart")
    public void clickAddToCart() {
        productPage.clickAddToCart();
    }

    @Step("Do - Browser - Product Page - Click 'Continue Shopping'")
    public void clickContinueShopping() {
        productPage.clickContinueShopping();
    }

    @Step("Do - Browser - Product Page - Click 'Proceed to checkout'")
    public void clickProceedToCheckout() {
        productPage.clickProceedToCheckout();
    }

    @Step("Do - Browser - Product Page - Search '{productName}'")
    public void search(String productName) {
        super.search(productName);
    }
}
