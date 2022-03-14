package com.globalsqa.stepdef;

import com.globalsqa.pageobjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.globalsqa.base.Hook.driver;

public class LoginStep {

    LoginPage loginPage = new LoginPage(driver);

    @Given("click on customer login button")
    public void click_on_customer_login_button() {
        loginPage.clickOnCustomerLogin();
    }

    @When("select valid username and click on login button")
    public void select_valid_username_and_click_on_login_button() {
        loginPage.clickOnYourNameDropDown();
        loginPage.selectUserName();
        loginPage.clickOnYourNameLabel();
        loginPage.clickOnLoginButton();

    }

    @Then("verify that customer logged in successfully")
    public void verify_that_customer_logged_in_successfully() {
        boolean name_of_user = loginPage.getWelcomeMessage();
        Assert.assertTrue(name_of_user);
    }

}
