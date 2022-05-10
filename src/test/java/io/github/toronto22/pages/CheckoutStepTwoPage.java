package io.github.toronto22.pages;

import net.thucydides.core.pages.PageObject;

public class CheckoutStepTwoPage extends PageObject {
    private static final String FINISH_BUTTON = "#finish";

    public void finish(){
        $(FINISH_BUTTON).click();
    }
}
