package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.pages.LoginPage;

public class Login {
    @Steps
    LoginPage loginPage;

    @Given("user on login page")
    public void onLoginPage() {
        loginPage.onTapLoginPageButton();
    }


    @When("user input email {string}")
    public void userInputEmail(String email) {
        loginPage.onEmailField(email);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.onPasswordField(password);
    }

    @Then("Tap login Button")
    public void tapLoginButton() {
        loginPage.onTapLoginButton();
    }

    @Then("Verify user success login status")
    public void verifyUserSuccessLoginStatus() {
        loginPage.verifyLogoutButton();
    }

}
