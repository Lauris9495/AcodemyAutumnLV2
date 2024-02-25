package lekcijaSesi.pageObjects;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAProjectRegisterPage {
    WebDriver driver;

    @FindBy(id = "name")
    public WebElement nameInput;

    @FindBy(id="last_name")
    public WebElement lastNameInput;
    @FindBy(id="email")
    public WebElement eMailInput;
    @FindBy(id="email-confirm")
    public WebElement confirmEmailInput;
    @FindBy(id="birth_date")
    public WebElement birthDateInput;
    @FindBy(id="password")
    public WebElement passwordInput;
    @FindBy(id="password-confirm")
    public WebElement confirmPasswordInput;
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkBoxInput;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitInput;

    @FindBy(xpath = "//div[@class='card-header']")
    public WebElement clickRandom;
    public QAProjectRegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void fillInRegisterForm(){
        QaProjectLandingPage.registerLink.click();
        QAProjectRegisterPage qaProjectRegisterPage = new QAProjectRegisterPage(driver);
        qaProjectRegisterPage.fillInRegisterForm();
        nameInput.sendKeys("Lauris");
        lastNameInput.sendKeys("Lavrinovičs");
        Faker faker = new Faker();
        String emailAddress = faker.internet().emailAddress();
        eMailInput.sendKeys(emailAddress);
        confirmEmailInput.sendKeys(emailAddress);
        birthDateInput.sendKeys("3/10/1994");
        clickRandom.click();
        passwordInput.sendKeys("test123");
        confirmPasswordInput.sendKeys("test123");
        checkBoxInput.click();
    }

}
