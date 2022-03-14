package com.globalsqa.pageobjects;

import com.globalsqa.base.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends PageObject {

    @FindBy(css = "[ng-click='customer()']")
    WebElement customer_login_button;

    @FindBy(id = "userSelect")
    WebElement your_name_dropDown;

    @FindBy(css = "#userSelect")
    WebElement select_username;

    @FindBy(css = "[class='btn btn-default']")
    WebElement login_button;

    @FindBy(css = "[class='fontBig ng-binding']")
    WebElement username_label;

    @FindBy(tagName= "label")
    WebElement your_name_label;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnCustomerLogin() {
        customer_login_button.click();
        waitInSecond(1);
    }

    public void clickOnYourNameDropDown() {
        your_name_dropDown.click();

    }

    public void selectUserName() {
        Select harry_username = new Select(select_username);
        harry_username.selectByValue("2");
    }

    public void clickOnYourNameLabel(){
    your_name_label.click();
    waitInSecond(1);
    }

    public void clickOnLoginButton(){
        login_button.click();
        waitInSecond(1);
    }

    public boolean getWelcomeMessage() {
        String username_text = username_label.getText();
        return username_text.contains("Harry");
    }


}
