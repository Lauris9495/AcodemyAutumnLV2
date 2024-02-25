package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSauceDemo extends TestSauceDemoMethods {
    private void loginTest(String email, String password) throws InterruptedException {

        WebElement loginEmailInput = driverSauce.findElement(By.id("user-name"));
        WebElement loginPasswordInput = driverSauce.findElement(By.id("password"));
        WebElement loginButton = driverSauce.findElement(By.id("login-button"));

        loginEmailInput.sendKeys(email);
        loginPasswordInput.sendKeys(password);
        loginButton.click();

    }
    @Test
    public void loginEmptyPasswordFilled() throws InterruptedException {
        loginTest("","secret_sauce");
        WebElement errorMessage = driverSauce.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/h3"));
        Assert.assertEquals(errorMessage.getText(),"Epic sadface: Username is required","Wrong error message!!!");
        System.out.println("Error message is: " +errorMessage.getText());
    }
    @Test
    public void loginFilledPasswordEmpty() throws InterruptedException {
      loginTest("standard_user","");
        WebElement errorMessageLoginFilled = driverSauce.findElement(By.xpath("//*[@id='login_button_container']/div/form/h3"));
        Assert.assertEquals(errorMessageLoginFilled.getText(), "Epic sadface: Password is required", "Wrong error message!!!");
        System.out.println("Error message is: " + errorMessageLoginFilled.getText());

    }
@Test
    public void credentialsEmpty() throws InterruptedException{
      loginTest("","");
        WebElement errorMessageAllEmpty = driverSauce.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertEquals(errorMessageAllEmpty.getText(), "Epic sadface: Username is required", "Wrong error message!!!");
        Thread.sleep(5000);
    System.out.println("Error message is: " + errorMessageAllEmpty.getText());
    }
@Test
    public void wrongCredentials() throws InterruptedException{

       loginTest("test123","wrongtest");
        WebElement errorMessageAllWrong = driverSauce.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertEquals(errorMessageAllWrong.getText(), "Epic sadface: Username and password do not match any user in this service", "Wrong error message!!!");
        Thread.sleep(5000);
        System.out.println("Error message is: " + errorMessageAllWrong.getText());
    }

}
