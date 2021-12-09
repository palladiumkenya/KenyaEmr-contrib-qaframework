package org.openmrs.kenyaemr.contrib.qaframework.automation;

import org.openmrs.kenyaemr.contrib.qaframework.automation.page.ForgotPasswordPage;
import org.openmrs.kenyaemr.contrib.qaframework.automation.page.LoginPage;
import org.openmrs.kenyaemr.contrib.qaframework.automation.test.TestBase;
import org.openmrs.kenyaemr.contrib.qaframework.RunTest;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.When.Whens;

public class ForgotPasswordSteps  extends TestBase {

    private LoginPage loginPage;
    private ForgotPasswordPage passwordPage;

    @Before(RunTest.HOOK.PASSWORD)
    public void setUpForgotPasswwordPage(){
		System.out.println(".... Reset password page ..........");
		loginPage = new LoginPage(getWebDriver());
    }
    
    @Given("a user goes to the login page")
    public void goToLoginPage(){
        loginPage.go();
    }
    @When("a user clicks on forgot passwordlink")
    public void clickOnForgotPasswordLink(){
        passwordPage =  loginPage.clickOnForgotPasswordLink();
        
    }
    @Then("user click on cancel button")
    public void userClicksOnCancelButton(){
        passwordPage.clickOnCancelButton();
    }

    
}
