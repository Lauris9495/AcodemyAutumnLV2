package lekcijaSesi;

import com.github.javafaker.Faker;
import lekcijaSesi.pageObjects.QAProjectRegisterPage;
import lekcijaSesi.pageObjects.QaProjectLandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectTest extends QAProjectBaseTest{
//@Test
//    public void checkAllElementsOnLandingPageTest(){
//    QaProjectLandingPage qaProjectLandingPage = new QaProjectLandingPage(driver);
//    Assert.assertEquals(qaProjectLandingPage.checkIfElementsExistOnePage(),true);
//    }
@Test
public void testSuccessfulRegistration() throws InterruptedException {
    Faker faker = new Faker();
    QaProjectLandingPage qaProjectLandingPage = new QaProjectLandingPage(driver);
    QaProjectLandingPage.registerLink.click();
    QAProjectRegisterPage qaProjectRegisterPage = new QAProjectRegisterPage(driver);
    qaProjectRegisterPage.nameInput.sendKeys("Lauris");
    qaProjectRegisterPage.lastNameInput.sendKeys("Lavrinovičs");
    String emailAddress = faker.internet().emailAddress();
    qaProjectRegisterPage.eMailInput.sendKeys(emailAddress);
    qaProjectRegisterPage.confirmEmailInput.sendKeys(emailAddress);
    qaProjectRegisterPage.birthDateInput.sendKeys("3/10/1994");
    qaProjectRegisterPage.clickRandom.click();
    qaProjectRegisterPage.passwordInput.sendKeys("test123");
    qaProjectRegisterPage.confirmPasswordInput.sendKeys("test123");
    qaProjectRegisterPage.checkBoxInput.click();
    Thread.sleep(5000);
//    //parbaudisim, ka lietotajs ir ielogojies
//    QaProjectHomePage qaProjectHomePage = new QaProjectHomePage(driver);
//    Assert.assertEquals(qaProjectHomePage.menuDropDown.getText(),"Juris");
//    Assert.assertEquals(qaProjectHomePage.welcomeMessage.getText(),"Welcome, Kreilis! You are logged in!");
}
//    public void fillInRegisterForm(String name, String lastname, String emailAddress, String confirmEmailAddress,
//                                   String dateOfBirth, String password, String confirmPassword, boolean isTCChecked) {
//        nameInputField.sendKeys(name);
//        lastNameInputField.sendKeys(lastname);
//        emailInputField.sendKeys(emailAddress);
//        confirmEmailInputField.sendKeys(confirmEmailAddress);
//        birthDateField.sendKeys(dateOfBirth);
//        registerFormHeaderSection.click();
//        passwordInputField.sendKeys(password);
//        confirmPasswordInputField.sendKeys(confirmPassword);
//        if (isTCChecked) {
//            termsAndConditionsCheckbox.click();
//        }
//        submitButton.click();
//    }
//@Test
//public void testSuccessfulRegistration() throws InterruptedException {
//    Faker faker = new Faker();
//    QaProjectLandingPage qaProjectLandingPage = new QaProjectLandingPage(driver);
//    qaProjectLandingPage.registerLink.click();
//    String emailAddress = faker.internet().emailAddress();
//    QaProjectRegisterPage qaProjectRegisterPage = new QaProjectRegisterPage(driver);
//    qaProjectRegisterPage.fillInRegisterForm("Juris", "Kreilis", emailAddress, emailAddress, "01/26/1990",
//            "parole123", "parole123", true);
//    Thread.sleep(5000);
}

