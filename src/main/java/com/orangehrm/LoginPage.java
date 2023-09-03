package com.orangehrm;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Utility.Seleniumutility;

public class LoginPage extends Seleniumutility  {

	@FindBy(name="username")
	private WebElement userNameField;

	@FindBy(name="password")
	private WebElement pwdField;

	@FindBy(css="button[type='submit']")
	private WebElement loginBtn;

	public void enterUserNameAndPwd(String username, String password) {
		typeInput(userNameField, username);
		typeInput(pwdField, password);
	}

	public void clickOnLoginBtn() {
		clickOnElement(loginBtn);
	}

	public boolean verifyUserIsOnHomePage(String expectedHomePageUrl) {
		try {
			getCurrentPageUrl(expectedHomePageUrl);
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}
}
