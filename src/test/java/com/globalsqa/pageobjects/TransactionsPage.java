package com.globalsqa.pageobjects;

import com.globalsqa.base.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionsPage extends PageObject {

    @FindBy(css = "[ng-class='btnClass2']")
    WebElement deposit_dropDown_button;

    @FindBy(css = "[ng-model='amount']")
    WebElement amount_input_field;

    @FindBy(css = "[class='btn btn-default']")
    WebElement deposit_button;

    @FindBy(css = "[class='error ng-binding']")
    WebElement successful_deposit_label;

    public TransactionsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void depositDropDownButton(){
        deposit_dropDown_button.click();
        waitInSecond(1);
    }

    public void enterAmount(int amount){
        amount_input_field.sendKeys(String.valueOf(amount));
        waitInSecond(1);
    }

    public void clickOnDepositButton(){
        deposit_button.click();
        waitInSecond(1);
    }

    public boolean successfulDepositIsDisplayed(){
        return successful_deposit_label.isDisplayed();
    }

}
