package io.github.toronto22.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.toronto22.model.UserInformation;

import java.util.List;
import java.util.Map;

public class OrderProductsSteps extends BaseSteps{
    @DataTableType(replaceWithEmptyString = "[anonymous]")
    public UserInformation bookEntryTransformer(Map<String, String> row) {
        return new UserInformation(
                row.get("firstName"),
                row.get("lastName"),
                row.get("code")
        );
    }

    @When("customer add products to cart")
    public void customerAddProductsToCart(DataTable table) {

    }

    @And("customer check out the cart")
    public void customerCheckOutTheCart(List<UserInformation> userInformation) {
        cartPage.setDriver(driver);
        cartPage.open();
        checkoutStepOnePage = cartPage.checkout();
        checkoutStepOnePage.continueNextStep(userInformation.get(0));
    }

    @Then("customer is announce that order is completed")
    public void customerIsAnnounceThatOrderIsCompleted() {
    }
}
