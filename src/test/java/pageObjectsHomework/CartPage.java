package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    WebDriver driverDemo;

    @FindBy(id = "item_4_title_link")
    public WebElement itemForTest;

    @FindBy(className = "btn_action checkout_button")
    public WebElement checkoutButton;


}
