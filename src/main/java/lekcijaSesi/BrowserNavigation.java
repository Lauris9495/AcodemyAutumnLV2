package lekcijaSesi;

import lekcijaSesi.pageObjects2.OneALandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.lang.ref.WeakReference;
import java.nio.file.WatchEvent;
import java.util.List;

public class BrowserNavigation extends BaseTest {
    @Test
    public void testBrowserNavigation() throws InterruptedException {
        driver.get("https://www.1a.lv");

        WebElement smartNetBanner = driver.findElement(By.className("smart-net-banner__info-button-text"));
        smartNetBanner.click();

        List<WebElement> listOInputFields = driver.findElements(By.className("users-session-form__input--text"));

        for (WebElement listOInputField : listOInputFields) {
//            listOInputFields.sendKeys("Lauris");

        }

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        Thread.sleep(7000);


    }
    @Test
    public void testAcceptCookiesIn1a() throws InterruptedException {
        driver.get("https://www.1a.lv");
        WebElement acceptAllCookiesButton= driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        WebElement cookieBanner = driver.findElement(By.id("cookiebanner"));
        Assert.assertTrue(cookieBanner.isDisplayed(),"Cookie banner is not displayed!!!");
        System.out.println(cookieBanner.getTagName());
//        Assert.assertEquals(cookieBanner.getCssValue("display"),"block");
//        Assert.assertEquals(cookieBanner.getCssValue("display"),"none");
        acceptAllCookiesButton.click();
        Assert.assertFalse(cookieBanner.isDisplayed(),"Cookie banner is displayed!!!");

        Thread.sleep(6000);

    }
    @Test
    public void testAttributeIn1a(){
        driver.get("https://www.1a.lv");
        OneALandingPage oneALandingPage = new OneALandingPage(driver);
        //li[contains(@class,'language-switcher')]/a[text()='LV']
        List<WebElement> languageElements = driver.findElements(By.xpath("//li[contains(@class,'language-switcher')]/a"));
        languageElements.get(1).click();
//        Assert.assertEquals(oneALandingPage.cookieBanner.getAttribute("lang"),"lv");
        oneALandingPage.switchLanguage("RU");
        Assert.assertEquals(oneALandingPage.cookieBanner.getAttribute("lang"),"ru");


    }
@Test
    public void test220Cookies() {

        driver.get("https://220.lv/lv/");
        WebElement cookieBlock = driver.findElement(By.className("cookies_wrapper"));
        Assert.assertTrue(cookieBlock.isDisplayed(), "Cookie block is not displayed");
        driver.findElement(By.xpath("//div[@class='cookies_wrapper']//button[@widget-attachpoint='agree']"));
//        Assert.assertFalse(cookieBlock.isDisplayed(), "Cookie block is displayed");
    }

    @Test
    public void keyboardActions() throws InterruptedException {
        driver.get("https://www.selenium.dev/documentation/webdriver/actions_api/keyboard/");
        Thread.sleep(5000);
       new Actions(driver)
               .keyDown(Keys.COMMAND)
               .sendKeys("K")
               .perform();
       Thread.sleep(5000);

       new Actions(driver)
               .sendKeys(Keys.ESCAPE)
               .perform();
       Thread.sleep(5000);


                    }
}
