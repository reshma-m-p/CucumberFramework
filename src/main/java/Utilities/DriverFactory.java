package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver1) {
        driver = driver1;
    }

    public static void initializeddriver() throws IOException, IOException {
        String browsername = UtilityFetchProperty.fetchPropertyValue("browser");

        switch (browsername) {  //=edge
            case "Chrome":
                driver = new ChromeDriver();
                setDriver(driver);
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                setDriver(driver);
                break;
            case "Edge":
                driver = new EdgeDriver();
                setDriver(driver);
                break;
            default:
                driver = new ChromeDriver();
                setDriver(driver);
                break;
        }
    }
}
