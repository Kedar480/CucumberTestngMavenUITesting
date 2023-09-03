package StepDefinition;

import java.net.SocketException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orangehrm.LoginPage;

import Utility.Seleniumutility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_SD extends Seleniumutility {
	WebDriver driver;
	LoginPage orgLogin;

	@Given("User opens the {string} browser and OrangeHRM application using {string}")
	public void user_opens_the_browser_and_OrangeHRM_application_using(String browser, String url) throws SocketException {
		driver = setUp(browser, url);
		orgLogin = PageFactory.initElements(driver,  LoginPage.class);
	}

	@When("User enters  username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		orgLogin.enterUserNameAndPwd(username, password);
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		orgLogin.clickOnLoginBtn();
	}

	@Then("User should navigate to home page having url as {string}")
	public void user_should_navigate_to_home_page_having_url_as(String expectedHomePageUrl) {
		Assert.assertTrue(orgLogin.verifyUserIsOnHomePage(expectedHomePageUrl));
	}
	
	@When("User enters  {string} and {string}")
	public void user_enters_and(String string, String string2) {
		orgLogin.enterUserNameAndPwd(string, string2);
	}
}
