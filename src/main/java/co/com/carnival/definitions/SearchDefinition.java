package co.com.carnival.definitions;

import co.com.carnival.steps.SearchStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchDefinition {

  @Steps SearchStep searchStep;

  @Given("^a web browser on the Carnival page$")
  public void openBrowserCarnival() {
    searchStep.openPageCarnival();
  }

  @When("^i enter the origin of the cruise$")
  public void enterOriginCruise() {
    searchStep.enterOriginCruise();
  }

  @When("^i enter the destination of the cruise$")
  public void enterDestinationCruise() {
    searchStep.enterDestinationCruise();
  }

  @When("^enter the duration of the cruise$")
  public void enterDurationCruise() {
    searchStep.enterDurationCruise();
  }

  @When("^i give you search$")
  public void searchCruises() {
    searchStep.searchCruises();
  }

  @Then("^i validate that the display grid is allowed to manage$")
  public void validateDisplayCruisesGridFilter() {
    searchStep.validateDisplayCruisesGridFilter();
  }

  @Then("^it is allowed to manage the price filter$")
  public void validatePricingFilter() {
    searchStep.validatePricingFilter();
  }

  @Then("^it is allowed to manage the search sort filter by prices$")
  public void validateSortPricesFilter() {
    searchStep.validateSortPricesFilter();
  }
}
