/*package StepDefinition;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
   // static WebDriver driver;

    @Given("User should be navigated to the Login page")
    public static void userShouldBeNavigatedToTheLoginPage() {
        LoginPage.setUp();
    }

    @When("Login with valid username & valid password")
    public void loginWithValidUsernameValidPassword() throws InterruptedException {
        LoginPage.login();
    }

    @Then("Successful login")
    public void successfulLogin() {
        LoginPage.homePageNavigation();
    }

    @When("Login with invalid username & invalid password")
    public void loginWithInvalidUsernameInvalidPassword() throws InterruptedException {
        LoginPage.login();
    }

    @Then("Unsuccessful login")
    public void unsuccessfulLogin() {
        LoginPage.homePageNavigation();
    }
}
//This file is created when the feature file is executed initially.*/