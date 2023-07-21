package com.MySeleniumMavenAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;

	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"nav-signin-tooltip\"]/a/span")
	public WebElement signinLink;

	@FindBy(how = How.ID, using = "ap_email")
	public WebElement email;

	@FindBy(how = How.ID, using = "continue")
	public WebElement continueButton;

	@FindBy(how = How.NAME, using = "password")
	public WebElement password;

	public void clickSignin() {
		signinLink.click();
	}

	public void Continue() {
		continueButton.click();
	}

	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}

	public void enterPass(String pass) {
		password.sendKeys(pass);
	}

}
