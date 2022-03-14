package com.globalsqa.base;

import org.openqa.selenium.Alert;

import static com.globalsqa.base.Hook.driver;

public class PageObject {

    protected void waitInSecond(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Alert switchToAlert() {
        return driver.switchTo().alert();
    }

}
