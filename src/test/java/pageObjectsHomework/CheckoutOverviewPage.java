package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage {
    WebDriver driverDemo;

    @FindBy(id = "item_4_title_link")
    public WebElement itemInCheckout;

    @FindBy(xpath = "//*[@id=checkout_summary_container]/div/div[2]/div[1]")
    public WebElement paymentInfo;

    @FindBy(xpath = "//*[@id=checkout_summary_container]/div/div[2]/div[2]")
    public WebElement sauceCard;

    @FindBy(className = "btn_action cart_button")
    public WebElement finishButton;

}


