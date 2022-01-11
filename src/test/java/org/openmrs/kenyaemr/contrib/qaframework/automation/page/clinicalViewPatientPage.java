package org.openmrs.kenyaemr.contrib.qaframework.automation.page;

import org.openqa.selenium.By;

public class clinicalViewPatientPage  extends Page {

    public static final String URL_PATH = "/clinician/clinicianViewPatient.page?patientId=6541&";

    public static final By TB_SCREENING = By.xpath("/html/body/div[4]/div[1]/table/tbody/tr/td[2]/div[8]/div[2]/div[6]/b");
    public static final By COMPLETED_FORMS = By.xpath("/html/body/div[4]/div[1]/table/tbody/tr/td[2]/div[9]/div[2]/div[1]/div[2]");
    public static final By DELETE_BUTTON = By.xpath("/html/body/div[7]/div/div[3]/button[2]");

    public clinicalViewPatientPage(Page parent) {
        super(parent);
    }

    public EnterFormsPage clickOnTbScreeningForm(){
        clickOn(TB_SCREENING);
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
