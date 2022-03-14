package com.globalsqa.stepdef;

import com.globalsqa.pageobjects.TransactionsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.globalsqa.base.Hook.driver;

public class TransactionsStep {

    TransactionsPage transactionsPage = new TransactionsPage(driver);

    @When("click on deposit dropDown button")
    public void click_on_deposit_drop_down_button() {
    transactionsPage.depositDropDownButton();
    }
    @When("enter a nonNegative amount in amount input field")
    public void enter_a_non_negative_amount_in_amount_input_field() {
    transactionsPage.enterAmount(1000);
    }
    @When("click on deposit button")
    public void click_on_deposit_button() {
    transactionsPage.clickOnDepositButton();
    }
    @Then("Observe that amount deposited successfully")
    public void observe_that_amount_deposited_successfully() {
        Assert.assertTrue(transactionsPage.successfulDepositIsDisplayed());
    }

}
