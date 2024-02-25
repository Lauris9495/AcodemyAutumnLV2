package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutSuccessPage {
    WebDriver driverDemo;

    @FindBy(className = "complete-header")
    public WebElement orderComplete;

    @FindBy(className = "complete-text")
    public WebElement orderSent;

}
