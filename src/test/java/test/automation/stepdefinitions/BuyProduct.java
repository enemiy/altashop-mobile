package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.HomePage;
import test.automation.pages.LoginPage;

public class BuyProduct {
    @Steps
    HomePage homePage;

    @Given("user on homepage")
    public void onHomePage() { Assert.assertTrue(homePage.isOnPage());}

    @When("user click beli")
    public void userClickBeli() {
        homePage.tapBeliButton();
    }

    @Then("item added to cart")
    public void itemInCart() {
        { Assert.assertTrue(homePage.itemInCart());}
    }


}
