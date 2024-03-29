package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestSauceDemoMethods {

       WebDriver driverSauce;

        @BeforeMethod
        public void setUpBrowser() {
            driverSauce = new ChromeDriver();
            driverSauce.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driverSauce.manage().window().maximize();
            driverSauce.get("https://www.saucedemo.com/v1/");
        }

        @AfterMethod
        public void closeBrowser() {
            driverSauce.close();
        }
}

