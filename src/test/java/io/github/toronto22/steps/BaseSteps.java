package io.github.toronto22.steps;

import io.github.toronto22.pages.CartPage;
import io.github.toronto22.pages.CheckoutStepOnePage;
import io.github.toronto22.pages.InventoryPage;
import io.github.toronto22.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class BaseSteps {
    protected WebDriver driver;
    protected LoginPage loginPage = new LoginPage();
    protected InventoryPage inventoryPage = new InventoryPage();
    protected CartPage cartPage = new CartPage();
    protected CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();
}
