package co.com.carnival.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.carnival.com/")
public class HomePage extends PageObject {
  @FindBy(id = "cdc-destinations")
  WebElementFacade contOrigin;

  @FindBy(xpath = ".//li[14]/button")
  WebElementFacade btnOrigin;

  @FindBy(id = "cdc-durations")
  WebElementFacade contDuration;

  @FindBy(xpath = ".//li[2]/button")
  WebElementFacade btnDuration;

  @FindBy(xpath = ".//li[6]/a/span")
  WebElementFacade btnSearchCruises;

  @FindBy(id = "cdc-ports")
  WebElementFacade contDestination;

  @FindBy(xpath = ".//li[9]/button")
  WebElementFacade btnDestination;

  public void selectOrigin() {
    contOrigin.waitUntilPresent();
    contOrigin.waitUntilClickable().click();
    btnOrigin.waitUntilPresent();
    btnOrigin.waitUntilClickable().click();
  }

  public void selecDestination() {
    contDestination.waitUntilPresent();
    contDestination.waitUntilClickable().click();
    btnDestination.waitUntilPresent();
    btnDestination.waitUntilClickable().click();
  }

  public void selectDuration() {
    contDuration.waitUntilPresent();
    contDuration.waitUntilClickable().click();
    btnDuration.waitUntilPresent();
    btnDuration.waitUntilClickable().click();
  }

  public void selectSearchCruises() {
    btnSearchCruises.waitUntilPresent();
    btnSearchCruises.waitUntilClickable().click();
  }

}
