package io.github.toronto22.pages;

import io.github.toronto22.model.UserInformation;
import net.thucydides.core.pages.PageObject;

public class CheckoutStepOnePage extends PageObject {
    private static final String FIRST_NAME_INPUT = "#first-name";
    private static final String LAST_NAME_INPUT = "#last-name";
    private static final String PORTAL_CODE_INPUT = "#postal-code";
    private static final String CONTINUE_BUTTON = "#continue";

    public CheckoutStepTwoPage continueNextStep(UserInformation userInformation) {
        $(FIRST_NAME_INPUT).sendKeys(userInformation.getFirstName());
        $(LAST_NAME_INPUT).sendKeys(userInformation.getLastname());
        $(PORTAL_CODE_INPUT).sendKeys(userInformation.getCode());
        $(CONTINUE_BUTTON).click();

        return new CheckoutStepTwoPage().setDriver(getDriver());
    }
}
