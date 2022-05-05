package io.github.toronto22.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.toronto22.pages.InventoryPage;
import io.github.toronto22.pages.LoginPage;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    //action

    @When("^user login with username and password$")
    public void userLoginWithUsernameAndPassword() {
        loginPage.openApplication();
        loginPage.Login("standard_user","secret_sauce");
        inventoryPage.setDriver(loginPage.getDriver());
    }

    // Verify

    @Then("user is navigated to inventory page")
    public void userIsNavigatedToInventoryPage() {
        inventoryPage.isCurrentlyDisplayed();
    }
}
