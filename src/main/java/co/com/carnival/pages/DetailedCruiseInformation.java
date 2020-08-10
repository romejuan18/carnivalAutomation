package co.com.carnival.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class DetailedCruiseInformation extends PageObject {
    @FindBy(xpath = ".//div[1]/div/div/button")
    WebElementFacade btnMoreDetailItineraty;

    @FindBy(xpath = ".//*[@id=\"details\"]/div[3]/div[1]/div/button/span")
    WebElementFacade btnPresencePageDetail;

    @FindBy(xpath = ".//booking-button/div/span/span/span[4]/span")
    WebElementFacade btnBook;

    public void setupDriver(){
        driver = new ChromeDriver();
    }

    private WebDriver driver;

    public void selectDetailItinerary() {
        btnPresencePageDetail.waitUntilPresent();
        btnMoreDetailItineraty.waitUntilPresent();
        btnMoreDetailItineraty.waitUntilClickable().click();
        driver.navigate().back();
    }

    public void validatePresenceReserve(){
        btnBook.waitUntilPresent().click();
        driver.navigate().back();
    }
}
