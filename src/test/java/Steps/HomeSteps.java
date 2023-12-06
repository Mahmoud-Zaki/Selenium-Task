package Steps;

import Definitions.HomeDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeSteps {
    private final HomeDefinitions homeDefinitions = new HomeDefinitions();

    @Given("Go to Home page")
    public void goToHomePage() {
        homeDefinitions.goToHomePage();
    }

    @When("Enter the donation for Gaza as {string}")
    public void enterTheDonationForGaza(String amount) {
        homeDefinitions.enterTheDonationForGaza(amount);
    }

    @Then("Verify that the cart increased by one")
    public void verifyThatTheCartIncreasedByOne() {
        Assert.assertEquals(homeDefinitions.getNumbersOfCartItemsAfterDonation(),
                homeDefinitions.getNumbersOfCartItemsBeforeDonation() + 1);
    }
}