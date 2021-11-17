package org.openmrs.contrib.kenyaemr.qaframework.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This class represents the Login page
 */
public class LoginPage extends Page {
	
	private final String LOGIN_PATH = "/login.htm";
	
	private final String LOGOUT_PATH = "/logout";
	
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
	
	public HomePage goToHomePage() {
		go();
		enterUsername(this.username);
		enterPassword(this.password);
		clickLoginButton();
		return new HomePage(this);
	}
	
	public HomePage goToHomePage(String userName, String password) {
		go();
		enterUsername(userName);
		enterPassword(password);
		clickLoginButton();
		return new HomePage(this);
	}
	
	public Boolean hasLoginButton() {
		return hasElement(BUTTON_LOGIN);
	}
	
}
