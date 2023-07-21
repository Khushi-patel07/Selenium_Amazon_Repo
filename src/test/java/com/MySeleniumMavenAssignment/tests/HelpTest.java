package com.MySeleniumMavenAssignment.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MySeleniumMavenAssignment.pages.HelpPage;

public class HelpTest extends BaseTest {

	private static Logger logger = LogManager.getLogger();

	@Test(groups = { "sanity", "invalid" })
	public void Help() {

		HelpPage user = new HelpPage(driver);
		user.abc();
		user.efg();
		Assert.assertEquals(driver.getTitle(), "Help - Amazon Customer Service");
		logger.info("It is a Amazon Help Page");
	}
}
