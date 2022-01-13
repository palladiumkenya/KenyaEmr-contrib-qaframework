package org.openmrs.kenyaemr.contrib.qaframework.automation.page;

import org.openqa.selenium.By;

public class FacilityDashboardPage extends Page {

    private final String FACILITY_DASHBOARD_PAGE_PATH = "openmrs/index.htm";

    private final By HOME_ICON = By.cssSelector(".ke-apptoolbar > div:nth-child(1) > a:nth-child(1)");

    public FacilityDashboardPage(Page parent) {
        super(parent);
    }
    
    public HomePage goToHomePage(){
        clickOn(HOME_ICON);
        return new HomePage(this);    
    }

    @Override
    public String getPageUrl() {
        return FACILITY_DASHBOARD_PAGE_PATH;
    }

}
