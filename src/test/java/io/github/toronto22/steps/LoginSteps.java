package io.github.toronto22.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.toronto22.pages.InventoryPage;
import io.github.toronto22.pages.LoginPage;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends BaseSteps{
    @When("^user login with username and password$")
    public void userLoginWithUsernameAndPassword() {
        loginPage.openApplication();
        driver = loginPage.getDriver();
        loginPage.Login("standard_user","secret_sauce");
        inventoryPage.setDriver(loginPage.getDriver());
    }

    // Verify

    @Then("user is navigated to inventory page")
    public void userIsNavigatedToInventoryPage() {
        inventoryPage.isCurrentlyDisplayed();
    }
}
