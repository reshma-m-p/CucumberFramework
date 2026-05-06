package Pages;

import Utilities.DriverFactory;
import Utilities.UtilityFetchProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class LoginPageWithParameters {
    //public static WebDriver driver;

    public static void setUp() throws IOException, InterruptedException {
        /*driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();*/
        DriverFactory.initializeddriver();
        DriverFactory.getDriver().get(UtilityFetchProperty.fetchPropertyValue("url"));
        DriverFactory.getDriver().manage().window().maximize();
        Thread.sleep(1000);
    }

    public static void login(String userName, String Password) throws InterruptedException {
        Thread.sleep(3000);
        WebElement name = DriverFactory.getDriver().findElement(By.name("username"));
        name.sendKeys(userName);
        WebElement passwordName = DriverFactory.getDriver().findElement(By.name("password"));
        passwordName.sendKeys(Password);
        WebElement button = DriverFactory.getDriver().findElement(By.tagName("button"));
        button.click();
        Thread.sleep(3000);
    }

    public static void homePageNavigation() {
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actualUrl = DriverFactory.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        if (actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Test case passed");
        } else
            System.out.println("Test case failed");
    }

    public static void tearDown() {
        //driver.close();
        DriverFactory.getDriver().close();
    }
}
