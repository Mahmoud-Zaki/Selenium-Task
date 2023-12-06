package Steps;

import Definitions.CartDefinition;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CartSteps {
    private final CartDefinition cartDefinition = new CartDefinition();

    @Given("Go to Cart page")
    public void goToCartPage() {
        cartDefinition.goToCartPage();
    }

    @When("Enter data with the following details:")
    public void enterDataWithTheFollowingDetails(DataTable dataTable) {
        cartDefinition.enterDataWithTheFollowingDetails(dataTable);
    }

    @Then("Verify that the successful message is displayed")
    public void verifyThatTheSuccessfulMessageIsDisplayed() {
        Assert.assertEquals(cartDefinition.getActualSuccessfulMessage(),cartDefinition.getExpectedSuccessfulMessage());
    }
}