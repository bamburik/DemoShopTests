package com.bamburov.tests;

import org.testng.annotations.Test;

public class Tests extends BaseTest {

    private String product1Name = "Hummingbird printed t-shirt";
    private String product2Name = "Hummingbird printed sweater";

    @Test
    public void testUserCanAdd2ProductsToCart() {
        Do().browser().open();
        Do().browser().homePage().search(product1Name);
        Do().browser().searchResults().clickOnFirstProduct();
        Do().browser().productPage().clickAddToCart();
        Do().browser().productPage().clickContinueShopping();
        Do().browser().productPage().search(product2Name);
        Do().browser().searchResults().clickOnFirstProduct();
        Do().browser().productPage().clickAddToCart();
        Do().browser().productPage().clickProceedToCheckout();
        Do().browser().cartPage().checkProductPresence(product1Name);
        Do().browser().cartPage().checkProductPresence(product2Name);
    }

    @Test
    public void testUserCanProceedToCheckoutFromCart() {
        Do().browser().open();
        Do().browser().homePage().search(product1Name);
        Do().browser().searchResults().clickOnFirstProduct();
        Do().browser().productPage().clickAddToCart();
        Do().browser().productPage().clickProceedToCheckout();
        Do().browser().cartPage().clickProceedToCheckout();
        Do().browser().checkoutPage().checkPersonalInfoBlockPresence();
    }

}
