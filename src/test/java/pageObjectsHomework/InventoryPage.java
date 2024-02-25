package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage {
    WebDriver driverDemo;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")
    public WebElement itemBag;

    @FindBy(className = "svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ")
    public WebElement shoppingCartButton;

}
