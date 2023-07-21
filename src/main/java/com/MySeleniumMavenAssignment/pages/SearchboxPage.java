package com.MySeleniumMavenAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchboxPage {

	WebDriver driver;

	public SearchboxPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "twotabsearchtextbox")
	public WebElement twotabsearchtextbox;

	@FindBy(how = How.XPATH, using = "//*[@id='nav-search-submit-button']")
	public WebElement submitButton;

	public void enterThing(String abc) {
		twotabsearchtextbox.sendKeys(abc);
	}

	public void Submit() {
		submitButton.click();
	}

}
