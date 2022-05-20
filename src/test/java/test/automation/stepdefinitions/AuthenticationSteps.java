package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.AltaShopPage;

public class AuthenticationSteps {
    @Steps
    AltaShopPage altaShopPage;

    @Given("user on login page")
    public void onLoginPage() {
        altaShopPage.onTapLoginPageButton();
    }


    @When("user input email {string}")
    public void userInputEmail(String email) {
        altaShopPage.onEmailField(email);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        altaShopPage.onPasswordField(password);
    }

    @Then("Tap login Button")
    public void tapLoginButton() {
        altaShopPage.onTapLoginButton();
    }

    @Then("Verify user success login status")
    public void verifyUserSuccessLoginStatus() {
        altaShopPage.verifyLogoutButton();
    }

//    @Then("User see result Subtraction is {string}")
//    public void userSeeResultSubtractionIs(String numb) {
//        Assert.assertEquals(numb, altaShopPage.getResultSubtraction());
//    }

}
