package org.openmrs.kenyaemr.contrib.qaframework.automation;

import org.openmrs.kenyaemr.contrib.qaframework.automation.page.ClinicianHomePage;
import org.openmrs.kenyaemr.contrib.qaframework.automation.page.EnterFormsPage;
import org.openmrs.kenyaemr.contrib.qaframework.automation.page.FacilityDashboardPage;
import org.openmrs.kenyaemr.contrib.qaframework.automation.page.HomePage;
import org.openmrs.kenyaemr.contrib.qaframework.automation.page.LoginPage;
import org.openmrs.kenyaemr.contrib.qaframework.automation.page.clinicalViewPatientPage;
import org.openmrs.kenyaemr.contrib.qaframework.automation.test.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openmrs.kenyaemr.contrib.qaframework.RunTest;

public class FormSteps extends TestBase {
    
    private LoginPage loginPage;

    private HomePage homePage;

    private ClinicianHomePage clinicianHomePage;

    private FacilityDashboardPage facilityDashboardPage;

    private clinicalViewPatientPage clinicalViewPatientPage;

    private EnterFormsPage enterFormsPage;

    @After(RunTest.HOOK.FORM)
    public void destroy() {
        quit();
    }

    @Before(RunTest.HOOK.FORM)
    public void setLoginPage() {
        System.out.println("..... form .......");
        loginPage = new LoginPage(getWebDriver());
    }

    @Given("user logs into kenyaemr system and goes to the Home page")
    public void userVisitLoginPage() throws Exception {
        facilityDashboardPage =  loginPage.goToFacilityDashboardPage();
    }

    @And("system loads facility dashboard page")
    public void loadFacilityDashboardPage(){
        facilityDashboardPage.waitForPage();
    }
    
    @Then("User loads home page")
    public void launchHomePage(){
        homePage = facilityDashboardPage.goToHomePage();
    }
    
    @And("system load home page")
    public void loadHomePage(){
         //we need to put all the apps present on the home page as assertions
        homePage.waitForPageToLoad();
    }
    
    @Then("user click on clinician home page")
    public void clickOnClinicianHomePage(){
       clinicianHomePage =  homePage.clickOnClinicianHomePage();
    }

    @And("the system loads clinician home page")
    public void systemLoadClinicianHomepage(){
        clinicianHomePage.waitForPage();
    }

    @Then("user clicks on first patient")
    public void clickOnFirstPatient(){
        clinicalViewPatientPage = clinicianHomePage.clickOnFirstPatient();
    }

    @And("system loads clinicalView patient page")
    public void loadClinicalViewPatientPage(){
        // use assertion instead of waiting for page
        clinicalViewPatientPage.waitForPage();
    }

    @And("user clicks on Tb screening Form")
    public void clickOnTbScreeningForm(){
        enterFormsPage = clinicalViewPatientPage.clickOnTbScreeningForm();
    }

    // @Then("enter tb screening diagnosis")
    // public void enterTbScreenDiagnosis(){
    //     enterFormsPage.enterTbScreenDiagnosis();
    // } 

    @Then("user click on enter button")
    public void clickOnEnterButton(){
      clinicalViewPatientPage =  enterFormsPage.clickOnEnterButton();
    }

    // @And("user clicks on completed visit form")
    // public void clickOnCompletedVisitForms(){
    //     clinicalViewPatientPage.clickOnCompletedVisitForms();
    //     clinicalViewPatientPage.waitForPage();
    // }
    
    // @Then("user clicks on delete form button")
    // public void clickOnDeleteFormButton(){
    //     clinicalViewPatientPage.clickOnDeleteButton();
    // }

    
}
