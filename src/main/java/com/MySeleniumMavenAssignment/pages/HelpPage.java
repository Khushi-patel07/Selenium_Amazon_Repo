package com.MySeleniumMavenAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {

	WebDriver driver;

	public HelpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[6]/a")
	public WebElement Help;

	@FindBy(how = How.XPATH, using = "//*[@id=\"category-section\"]/li[13]/a")
	public WebElement CustomerService;

	public void abc() {
		Help.click();
	}

	public void efg() {
		CustomerService.click();
	}

}
