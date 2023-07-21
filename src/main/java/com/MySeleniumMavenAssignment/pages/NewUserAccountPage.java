package com.MySeleniumMavenAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewUserAccountPage {

	WebDriver driver;

	public NewUserAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.LINK_TEXT, using = "Start here.")
	public WebElement starthereLink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ap_customer_name\"]")
	public WebElement Yourname;

	@FindBy(how = How.ID, using = "ap_email")
	public WebElement Email;

	@FindBy(how = How.NAME, using = "password")
	public WebElement Password;

	@FindBy(how = How.ID, using = "continue")
	public WebElement continueButton;

	public void clickStarthereLink() {
		starthereLink.click();
	}

	public void enterName(String name) {
		Yourname.sendKeys(name);
	}

	public void enterEmail(String email) {
		Email.sendKeys(email);
	}

	public void enterPassword(String pass) {
		Password.sendKeys(pass);
	}

	public void Continue() {
		continueButton.click();
	}

}
