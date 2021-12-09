package org.openmrs.kenyaemr.contrib.qaframework.automation.page;

import org.openqa.selenium.By;

public class ForgotPasswordPage  extends Page {

    private final String FORGOT_PASSWORD = "/forgotPassword.form";

    private final By CANCEL_BUTTON = By.cssSelector("body > div.ke-page-container > form > button:nth-child(7)");

    public ForgotPasswordPage(Page parent) {
        super(parent);
    }
    public void clickOnCancelButton(){
        clickOn(CANCEL_BUTTON);
    }


    @Override
    public String getPageUrl() {
       
        return FORGOT_PASSWORD;
    }
    
}
