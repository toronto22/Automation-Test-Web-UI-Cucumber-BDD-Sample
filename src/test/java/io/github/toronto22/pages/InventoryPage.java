package io.github.toronto22.pages;

import net.serenitybdd.core.pages.PageObject;
import org.assertj.core.api.Assertions;

public class InventoryPage extends PageObject {
    private static final String TITLE = ".title";

    public void isCurrentlyDisplayed(){
        String pageTitle = "PRODUCTS";
        String currentTitle = $(TITLE).getText();
        Assertions.assertThat(currentTitle).isEqualTo(pageTitle);
    }
}
