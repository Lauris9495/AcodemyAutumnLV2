package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driverDemo;
    @FindBy(id = "user-name")
    public WebElement userNameInput;

    @FindBy(xpath = "//*[@id=password]")
    public WebElement passwordInput;

    @FindBy(id = "login-button")
    public WebElement loginButton;

}
