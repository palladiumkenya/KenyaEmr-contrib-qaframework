package org.openmrs.kenyaemr.contrib.qaframework.automation.page;

import org.openqa.selenium.By;

public class clinicalViewPatientPage  extends Page {

    public static final String URL_PATH = "/clinician/clinicianViewPatient.page?patientId=6541&";

    public static final By TB_SCREENING = By.cssSelector("body > div.ke-page-container > div.ke-page-content > table > tbody > tr > td:nth-child(2) > div:nth-child(7) > div.ke-panel-content > div:nth-child(5)");
    public static final By COMPLETED_FORMS = By.xpath("/html/body/div[4]/div[1]/table/tbody/tr/td[2]/div[9]/div[2]/div[1]/div[2]");
    public static final By DELETE_BUTTON = By.xpath("/html/body/div[7]/div/div[3]/button[2]");
    public static final By CHECK_IN_FOR_VISIT = By.xpath("/html/body/div[4]/div[1]/table/tbody/tr/td[2]/div[1]/button");
    public static final By SUBMIT_BUTTON = By.xpath("/html/body/div[7]/div/div[2]/div[2]/button[1]");

    public static final By ANTENAL_VISIT = By.xpath("/html/body/div[4]/div[1]/table/tbody/tr/td[2]/div[6]/div[2]/div[1]");

    public clinicalViewPatientPage(Page parent) {
        super(parent);
    }

    public EnterFormsPage clickOnAntenalForm(){
        clickOn(ANTENAL_VISIT);
        return new EnterFormsPage(this);
    }

    public void clickOnCompletedVisitForms(){
        clickOn(COMPLETED_FORMS);
    }

    public void clickOnDeleteButton(){
        clickOn(DELETE_BUTTON);
    }
    
    @Override
    public String getPageUrl() {
        return URL_PATH;
    }

}
