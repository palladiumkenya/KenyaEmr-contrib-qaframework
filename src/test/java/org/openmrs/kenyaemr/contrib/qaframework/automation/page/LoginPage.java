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
import org.openqa.selenium.WebDriver;

/**
 * This class represents the Login page
 */
public class LoginPage extends Page {
	
	private final String LOGIN_PATH = "/login.htm";
	
	private final String LOGOUT_PATH = "/logout";

	private final  By FORGOT_PASSWORD = By.cssSelector("body > div.ke-page-container > div:nth-child(5) > form > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td:nth-child(2) > a");
	
	private final By FIELD_USERNAME = By.cssSelector("#uname");
	
	private final By FIELD_PASSWORD = By.cssSelector("input[type=password]");
	
	private final By BUTTON_LOGIN = By.xpath("//tbody/tr[3]/td[2]/button[1]");
	
	private String username;
	
	private String password;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		username = properties.getUsername();
		password = properties.getPassword();
	}
	
	@Override
	public void go() {
		goToPage(LOGIN_PATH);
	}
	
	@Override
	public String getPageUrl() {
		return LOGIN_PATH;
	}
	
	@Override
	public String getPageRejectUrl() {
		return "index.htm";
	}
	
	public void enterUsername(String username) {
		setTextToFieldNoEnter(FIELD_USERNAME, username);
	}
	
	public void enterPassword(String password) {
		setTextToFieldNoEnter(FIELD_PASSWORD, password);
	}
	
	public void clickLoginButton() {
		clickOn(BUTTON_LOGIN);
	}
	
	public  FacilityDashboardPage goToFacilityDashboardPage() {
		go();
		enterUsername(this.username);
		enterPassword(this.password);
		clickLoginButton();
		return new  FacilityDashboardPage(this);
	}
	
	
	public  FacilityDashboardPage goToFacilityDashboardPage(String userName, String password) {
		go();
		enterUsername(userName);
		enterPassword(password);
		clickLoginButton();
		return new  FacilityDashboardPage(this);
	}
	
	public Boolean hasLoginButton() {
		return hasElement(BUTTON_LOGIN);
	}	

	public ForgotPasswordPage clickOnForgotPasswordLink(){
		clickOn(FORGOT_PASSWORD);
		return new ForgotPasswordPage(this);
	}

}
