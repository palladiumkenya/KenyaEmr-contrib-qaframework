package org.openmrs.kenyaemr.contrib.qaframework.automation.page;

import org.openqa.selenium.By;

public class EnterFormsPage  extends Page {

    public static final String URL_PATH = "/kenyaemr/enterForm.page?appId=kenyaemr.medicalEncounter&visitId=57676&patientId=6541&formUuid=59ed8e62-7f1f-40ae-a2e3-eabe350277ce&returnUrl=%2Fopenmrs%2Fkenyaemr%2Fclinician%2FclinicianViewPatient.page%3FpatientId%3D6541%26&";
    public static final By COUGH_OF_ANY_DURATION = By.id("w8_0");
    public static final By TESTS_ORDERED = By.id("w18");
    public static final By CHESTS_XRAY = By.id("w26_0");
    public static final By CLINICAL_DIAGNOSIS = By.id("w32_0");
    public static final By START_ANTI_TBS = By.id("w40_0");
    public static final By ENTER_FORM = By.xpath("/html/body/div[5]/div[1]/div/form/div/div[3]/div/div[3]/input");
    public static  final By REGISTER_NUMBER = By.id("w10");
    public static final By APPOINTMENT_DATES = By.xpath("/html/body/div[5]/div[1]/div/form/div/div[3]/div/div[2]/table/tbody/tr[5]/td/table/tbody/tr[7]/td/fieldset/table[1]/tbody/tr/td/span[1]/input[1]");

 
    public EnterFormsPage(Page parent) {
        super(parent);
    }

    public void enterTbScreenDiagnosis(){
        clickOn(COUGH_OF_ANY_DURATION);
        clickOn(TESTS_ORDERED);
        clickOn(CHESTS_XRAY);
        clickOn(CLINICAL_DIAGNOSIS);
        clickOn(START_ANTI_TBS);
    }

    public clinicalViewPatientPage clickOnEnterButton(){
        clickOn(ENTER_FORM);
        return new clinicalViewPatientPage(this);
    }

    public void FillInAntenalForm(String number, String Appointment) {
          setTextToFieldNoEnter(REGISTER_NUMBER, number);
          setTextToFieldNoEnter(APPOINTMENT_DATES, Appointment);
    }
    

    @Override
    public String getPageUrl() {
  
        return URL_PATH;
    }

}
