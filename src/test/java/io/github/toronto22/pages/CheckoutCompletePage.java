package io.github.toronto22.pages;

import net.thucydides.core.pages.PageObject;

public class CheckoutCompletePage extends PageObject {
    private static final String BACK_HOME_BUTTON = "#back-to-products";

    public boolean isDisplayed(){
        return $(BACK_HOME_BUTTON).isDisplayed();
    }
}
