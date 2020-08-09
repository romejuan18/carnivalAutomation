package co.com.carnival.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CruiseResultsPage extends PageObject {
  @FindBy(xpath = ".//ccl-cruise-search-bar-layout-switcher/div/a[1]/i[2]")
  WebElementFacade btnGridFilter;

  @FindBy(id = "sfn-nav-pricing")
  WebElementFacade btnPricing;

  @FindBy(id = "sfn-nav-sort-pricing")
  WebElementFacade btnSortPrices;

  public void selectDisplayFilter() {
    btnGridFilter.waitUntilPresent();
    btnGridFilter.waitUntilClickable().click();
  }

  public void selectPricingFilter() {
    btnPricing.waitUntilPresent();
    btnPricing.waitUntilClickable().click();
  }

  public void selectSortPricesFilter() {
    btnSortPrices.waitUntilPresent();
    btnSortPrices.waitUntilClickable().click();
  }
}
