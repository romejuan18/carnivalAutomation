package co.com.carnival.steps;

import co.com.carnival.pages.CruiseResultsPage;
import co.com.carnival.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class SearchStep {

  @Page HomePage homePage;
  @Page CruiseResultsPage cruiseResultsPage;

  @Step
  public void openPageCarnival() {
    homePage.open();
  }

  @Step
  public void enterOriginCruise() {
    homePage.selectOrigin();
  }

  @Step
  public void enterDestinationCruise() {
    homePage.selecDestination();
  }

  @Step
  public void enterDurationCruise() {
    homePage.selectDuration();
  }

  @Step
  public void searchCruises() {
    homePage.selectSearchCruises();
  }

  @Step
  public void validateDisplayCruisesGridFilter() {
    cruiseResultsPage.selectDisplayFilter();
  }

  @Step
  public void validatePricingFilter() {
    cruiseResultsPage.selectPricingFilter();
  }

  @Step
  public void validateSortPricesFilter() {
    cruiseResultsPage.selectSortPricesFilter();
  }
}
