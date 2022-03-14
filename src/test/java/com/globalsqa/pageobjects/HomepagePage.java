package com.globalsqa.pageobjects;

import com.globalsqa.base.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePage extends PageObject {

    @FindBy(css = "[ng-click='manager()']")
    WebElement bank_manager_login_button;

    @FindBy(css = "[ng-click='addCust()']")
    WebElement add_customer_link;

    @FindBy(css = "[ng-model='fName']")
    WebElement firstname_text_field;

    @FindBy(css = "[ng-model='lName']")
    WebElement lastname_text_field;

    @FindBy(css = "[ng-model='postCd']")
    WebElement zipcode_text_field;

    @FindBy(css = "[class='btn btn-default']")
    WebElement add_customer_button;

    public HomepagePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnBankManagerLoginButton() {
        bank_manager_login_button.click();
        waitInSecond(1);
    }

    public void clickOnAddCustomerLinkAndEnterValidCredential(String firstname, String lastname, String zipcode) {
        add_customer_link.click();
        waitInSecond(1);
        firstname_text_field.sendKeys(firstname);
        lastname_text_field.sendKeys(lastname);
        zipcode_text_field.sendKeys(zipcode);
        waitInSecond(1);
    }

    public void clickOnAddCustomerButton() {
        add_customer_button.click();
        waitInSecond(1);
    }

}
