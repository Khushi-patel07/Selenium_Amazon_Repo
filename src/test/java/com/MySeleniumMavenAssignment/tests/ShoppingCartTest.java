package com.MySeleniumMavenAssignment.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.MySeleniumMavenAssignment.pages.ShoppingCartPage;

public class ShoppingCartTest extends BaseTest {

	private static Logger logger = LogManager.getLogger();

	@Test(groups = { "sanity", "invalid" })
	@Parameters({ "quantity" })
	public void AddToCart(String abc) {

		ShoppingCartPage product = new ShoppingCartPage(driver);
		product.clickBestseller();
		product.SelectBag();
		product.Selectquantity(abc);
		product.AddBag();
		product.Cart();
		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
		logger.info("It is a Amazon Shopping Cart Page");
	}
}
