package lekcijaSesi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MansOtraisSeleniumTests extends BaseTest{

    private void attemptToLogin(String email, String password) throws InterruptedException {
        driver.get("https://qaproject.acodemy.lv/login");
        Thread.sleep(5000);

        WebElement loginEmailInput = driver.findElement(By.id("email"));
        WebElement loginPasswordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.className("btn-primary"));

        loginEmailInput.sendKeys(email);
        loginPasswordInput.sendKeys(password);
        loginButton.click();
    }


    @Test
    public void successfulLoginTest() throws InterruptedException {
        driver.get("https://qaproject.acodemy.lv/login");
        Thread.sleep(5000);

        WebElement loginEmailInput = driver.findElement(By.id("email"));
        WebElement loginPasswordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.className("btn-primary"));

        loginEmailInput.sendKeys("emilysinclair@gmail.com");
        loginPasswordInput.sendKeys("qwerty123456#");
        loginButton.click();
        Thread.sleep(6000);


        WebElement nameDropDown = driver.findElement(By.id("navbarDropdown"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://qaproject.acodemy.lv/home","User is nor navigated ti home URl");
        Assert.assertEquals(nameDropDown.getText(),"Emily","Wrong username visible in header dropdown");
    }
@Test
    public void wrongCredentialsLoginTest() throws InterruptedException {
    driver.get("https://qaproject.acodemy.lv/login");
    WebElement loginEmailInput = driver.findElement(By.id("email"));
    WebElement loginPasswordInput = driver.findElement(By.id("password"));
    WebElement loginButton = driver.findElement(By.className("btn-primary"));

    loginEmailInput.sendKeys("emilysinclai@gmail.com");
    loginPasswordInput.sendKeys("qwerty123456");
    loginButton.click();

WebElement emailFieldErrorMessage = driver.findElement(By.className("invalid-feedback"));
Assert.assertEquals(emailFieldErrorMessage.getText(),"These credentials do not match our records.","Wrong credential message.");
Thread.sleep(5000);

}
    @Test
    public void emptyEmailLoginFieldTest(){

    }
    @Test
    public void emptyPasswordLoginFieldTest(){

    }


    
}
