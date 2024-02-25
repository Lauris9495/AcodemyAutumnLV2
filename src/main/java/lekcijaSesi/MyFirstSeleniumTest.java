package lekcijaSesi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstSeleniumTest extends BaseTest {

@Test
    public void MyFirstSeleniumTest() throws InterruptedException {


    driver.get("http://www.1a.lv");
Assert.assertEquals(driver.getCurrentUrl(),"https://www.1a.lv/");
    Thread.sleep(5000);




}

@Test
    public void checkPageTitleTest(){

    driver.get("http://www.acodemy.lv/lv");
    Assert.assertEquals(driver.getTitle(),"IT kursi Latvijā!","Wrong page title!");



}

@Test
    public void checkURL() throws InterruptedException {
    driver.get("http://www.1a.lv");
    driver.getCurrentUrl();
    Thread.sleep(5000);
}

}
