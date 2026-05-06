/*package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static WebDriver driver;

    public static void setUp() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    public static void login() throws InterruptedException {
        Thread.sleep(3000);
        WebElement name = driver.findElement(By.name("user"));
        name.sendKeys("Admin");
        WebElement passwordName = driver.findElement(By.name("password"));
        passwordName.sendKeys("admin123");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        Thread.sleep(3000);
    }

    public static void homePageNavigation() {
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        if (actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Test case passed");
        } else
            System.out.println("Test case failed");
    }

    public static void tearDown() {
        driver.close();
    }
}
*/