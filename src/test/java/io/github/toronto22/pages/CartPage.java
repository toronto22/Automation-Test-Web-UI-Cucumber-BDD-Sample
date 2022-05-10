package io.github.toronto22.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class CartPage extends PageObject {
    private static final String CHECKOUT_BUTTON = "#checkout";

    public CheckoutStepOnePage checkout() {
        $(CHECKOUT_BUTTON).click();
        return new CheckoutStepOnePage().setDriver(getDriver());
    }
}
