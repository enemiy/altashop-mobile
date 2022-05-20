package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.pages.LoginPage;
import test.automation.pages.RegisterPage;

public class Register {
    @Steps
    RegisterPage registerPage;

    @Given("user on register page")
    public void onRegisterPage() {
        registerPage.onLoginPageButton();
        registerPage.onRegisterPageButton();
    }


    @When("user input Email {string}")
    public void userInputEmail(String email) {
        registerPage.onEmailField(email);
    }

    @And("user input Name {string}")
    public void userInputName(String name) {
        registerPage.onNameField(name);
    }


    @And("user input Password {string}")
    public void userInputPassword(String password) {
        registerPage.onPasswordField(password);
    }

    @Then("Tap register button")
    public void tapRegisterButton() {
        registerPage.onTapRegisterButton();
    }

}
