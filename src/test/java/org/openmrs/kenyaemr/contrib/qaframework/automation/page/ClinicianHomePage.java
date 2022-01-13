package org.openmrs.kenyaemr.contrib.qaframework.automation.page;

import org.openqa.selenium.By;

public class ClinicianHomePage extends Page {
    
    public static final String URL_PATH = "/clinician/clinicianHome.page";

    private static final By FIRST_PATIENT = By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/table/tbody/tr/td[2]");

    public ClinicianHomePage(Page parent) {
        super(parent);
    }

    public clinicalViewPatientPage clickOnFirstPatient(){
        clickOn(FIRST_PATIENT);
        return new clinicalViewPatientPage(this);
    }
    
    @Override
    public String getPageUrl() {
        return URL_PATH;
    }
}
