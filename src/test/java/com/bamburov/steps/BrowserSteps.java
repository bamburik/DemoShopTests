package com.bamburov.steps;

import com.bamburov.models.Props;
import com.bamburov.pageObjects.CheckoutPage;
import com.bamburov.pageObjects.HomePage;
import com.bamburov.pageObjects.SearchResultsPage;
import com.bamburov.utils.Lazy;
import com.bamburov.utils.ReusablePool;
import io.qameta.allure.Step;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BrowserSteps {
    private Lazy<HomePageSteps> homePageSteps = new Lazy<>(HomePageSteps::new);

    private Lazy<SearchResultsSteps> searchResultsSteps = new Lazy<>(SearchResultsSteps::new);

    private Lazy<ProductPageSteps> productPageSteps = new Lazy<>(ProductPageSteps::new);

    private Lazy<CartPageSteps> cartPageSteps = new Lazy<>(CartPageSteps::new);

    private Lazy<CheckoutPageSteps> checkoutPageSteps = new Lazy<>(CheckoutPageSteps::new);

    public HomePageSteps homePage() {
        return homePageSteps.getValue();
    }

    public SearchResultsSteps searchResults() {
        return searchResultsSteps.getValue();
    }

    public ProductPageSteps productPage() {
        return productPageSteps.getValue();
    }

    public CartPageSteps cartPage() {
        return cartPageSteps.getValue();
    }

    public CheckoutPageSteps checkoutPage() {
        return checkoutPageSteps.getValue();
    }

    @Step("Do - Browser - Open")
    public void open() {
        Props props = ReusablePool.getInstance().get(Props.class);
        com.codeborne.selenide.Selenide.open(props.getBaseUrl());
        getWebDriver().manage().window().maximize();
        getWebDriver().manage().timeouts().implicitlyWait(Duration.of(props.getImplicitWaitInSeconds(), ChronoUnit.SECONDS));
        new HomePage().waitPageForLoad();
        switchTo().frame($("#framelive"));
    }
}
