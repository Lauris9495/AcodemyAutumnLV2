package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class sauceDemoTests {
    WebDriver driverDemo;

    @BeforeMethod
    public void setUpBrowser() {
        driverDemo = new ChromeDriver();
        driverDemo.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driverDemo.manage().window().maximize();
        driverDemo.get("https://www.saucedemo.com/v1/");
    }
    @AfterMethod
    public void closeBrowser() {
        driverDemo.close();
    }

    private void login(String email, String password) throws InterruptedException {

        WebElement userNameInput = driverDemo.findElement(By.id("user-name"));
        WebElement passwordInput = driverDemo.findElement(By.xpath("//*[@id=password]"));
        WebElement loginButton = driverDemo.findElement(By.id("login-button"));

        userNameInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();

    }




}
