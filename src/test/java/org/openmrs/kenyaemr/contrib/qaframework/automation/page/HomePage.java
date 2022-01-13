/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.kenyaemr.contrib.qaframework.automation.page;

import org.openqa.selenium.By;

/**
 * This class represents the Home page
 */
public class HomePage extends Page {
	
	private final By LINK_LOGOUT = By.className("logout");
	
	private final String PATH_HOME_RESET = "referenceapplication/home.page?noredirect=true";
	
	private final By FIELD_OLD_PASSWORD = By.xpath("//input[@id='oldPassword-field']");
	
	private final By FIELD_NEW_PASSWORD = By.xpath("//input[@id='newPassword-field']");
	
	private final By FIELD_CONFIRM_PASSWORD = By.xpath("//input[@id='confirmPassword-field']");
	
	private static final By SAVE_BUTTON = By.id("save-button");
	
	private static final By CLINICIAN_HOMEPAGE = By.cssSelector("body > div.ke-page-container > div.ke-page-content > div:nth-child(5) > button > img");
	
	private final String PATH_HOME = "/openmrs/index.htm";
	
	public HomePage(Page page) {
		super(page);
	}
	
	public ClinicianHomePage clickOnClinicianHomePage(){
		clickOn(CLINICIAN_HOMEPAGE );
		return new ClinicianHomePage(this);
	}
	
	@Override
	public String getPageUrl() {
		return PATH_HOME;
	}
	
	public String getPageUrlReset() {
		return PATH_HOME_RESET;
	}
	
	public Boolean hasLogOutLink() {
		return hasElement(LINK_LOGOUT);
	}
	
	public void clickLogout() {
		goToPage("appui/header/logout.action?successUrl=openmrs");
	}
	
	public void enterOldPassword(String oldPassword) {
		setText(FIELD_OLD_PASSWORD, oldPassword);
	}
	
	public void enterNewPassword(String newPassword) {
		setText(FIELD_NEW_PASSWORD, newPassword);
	}
	
	public void confirmNewPassword(String confirmPassword) {
		setText(FIELD_CONFIRM_PASSWORD, confirmPassword);
	}
	
	public String savePassword() {
		clickOn(SAVE_BUTTON);
		return "index.html";
	}
}
