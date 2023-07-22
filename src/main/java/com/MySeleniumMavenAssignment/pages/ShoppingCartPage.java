package com.MySeleniumMavenAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	WebDriver driver;

	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[3]")
	public WebElement Bestseller;

	@FindBy(how = How.XPATH, using = "//*[@id=\"B0BK1457X3\"]/a[2]/span/div")
	public WebElement Product;

	@FindBy(how = How.CSS, using = "#selectQuantity #quantity")
	public WebElement quantity;

	@FindBy(how = How.ID, using = "add-to-cart-button")
	public WebElement addtocart;

	@FindBy(how = How.XPATH, using = "//*[@id=\"sw-gtc\"]/span/a")
	public WebElement cart;

	public void clickBestseller() {
		Bestseller.click();
	}

	public void SelectBag() {
		Product.click();
	}

	public void Selectquantity(String abc) {
		quantity.sendKeys(abc);
	}

	public void AddBag() {
		addtocart.click();
	}

	public void Cart() {
		cart.click();
	}

}
