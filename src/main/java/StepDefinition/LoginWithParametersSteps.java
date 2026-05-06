package StepDefinition;

import Pages.LoginPageWithParameters;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class LoginWithParametersSteps {
  /*  @When("Login with valid username {string} & valid password {string}")
    public void loginWithValidUsernameValidPassword(String username, String password) throws InterruptedException {
        LoginPageWithParameters.login(username,password);
    }

    @When("Login with invalid username {string} & invalid password {string}")
    public void loginWithInvalidUsernameInvalidPassword(String username, String password) throws InterruptedException {
        LoginPageWithParameters.login(username,password);
    }

    @Given("User should be navigated to the Login page")
    public void userShouldBeNavigatedToTheLoginPage() {
        LoginPageWithParameters.setUp();
    }

    @Then("Successful login")
    public void successfulLogin() {
        LoginPageWithParameters.homePageNavigation();
    }

    @Then("Unsuccessful login")
    public void unsuccessfulLogin() {
        LoginPageWithParameters.homePageNavigation();
    }*/

    @Given("User should be navigated to the Login page")
    public void userShouldBeNavigatedToTheLoginPage() throws IOException, InterruptedException {
        LoginPageWithParameters.setUp();
    }
    @When("entered {} and {}")
    public void enteredAnd(String username, String password) throws InterruptedException {
        LoginPageWithParameters.login(username,password);
    }

    @Then("Successful or unsuccessful login")
    public void successfulOrUnsuccessfulLogin() {
        LoginPageWithParameters.homePageNavigation();
    }

    @And("browser should be closed")
    public void browserShouldBeClosed() {
        LoginPageWithParameters.tearDown();
    }
}
