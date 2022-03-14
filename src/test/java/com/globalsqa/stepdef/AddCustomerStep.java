package com.globalsqa.stepdef;

import com.globalsqa.pageobjects.HomepagePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.globalsqa.base.Hook.driver;

public class AddCustomerStep {

    HomepagePage homepage = new HomepagePage(driver);

    @Given("user is on globalsqa homepage website")
    public void user_is_on_globalsqa_homepage_website() {
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    @Given("click on bank manager login button")
    public void click_on_bank_manager_login_button() {
        homepage.clickOnBankManagerLoginButton();
    }

    @Given("enter valid credential after click on add customer tab link")
    public void enter_valid_credential_after_click_on_add_customer_tab_link() {
        homepage.clickOnAddCustomerLinkAndEnterValidCredential("kkk", "lll", "12345");
    }

    @When("click on add customer button")
    public void click_on_add_customer_button() {
        homepage.clickOnAddCustomerButton();
    }

    @Then("Notice that customer added successfully")
    public void notice_that_customer_added_successfully() {
        String user_added = homepage.switchToAlert().getText();
        Assert.assertTrue(user_added.contains("successfully"));
    }

}
