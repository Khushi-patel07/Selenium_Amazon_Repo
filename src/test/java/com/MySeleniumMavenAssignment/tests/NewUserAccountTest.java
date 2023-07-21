package com.MySeleniumMavenAssignment.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.MySeleniumMavenAssignment.pages.NewUserAccountPage;

public class NewUserAccountTest extends BaseTest {

	private static Logger logger = LogManager.getLogger();

	@Test(groups = { "sanity", "invalid" })
	@Parameters({ "Yourname", "Email", "Password" })
	public void NewUserRegistration(String name, String email, String pass) {

		NewUserAccountPage create = new NewUserAccountPage(driver);
		create.clickStarthereLink();
		create.enterName(name);
		create.enterEmail(email);
		create.enterPassword(pass);
		create.Continue();
		Assert.assertEquals(driver.getTitle(), "Amazon Registration");
		logger.info("Reach to Amazon Registration page");

	}
}
