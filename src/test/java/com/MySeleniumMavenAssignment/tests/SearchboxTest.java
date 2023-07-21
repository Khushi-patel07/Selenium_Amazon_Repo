package com.MySeleniumMavenAssignment.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.MySeleniumMavenAssignment.pages.SearchboxPage;

public class SearchboxTest extends BaseTest {

	private static Logger logger = LogManager.getLogger();

	@Test(groups = { "sanity", "invalid" })
	@Parameters({ "twotabsearchtextbox" })
	public void Searchbox(String abc) {

		SearchboxPage search = new SearchboxPage(driver);
		search.enterThing(abc);
		search.Submit();
		Assert.assertEquals(driver.getTitle(), "Amazon.in : selenium webdriver");
		logger.info("Search for product is Successful");

	}
}
