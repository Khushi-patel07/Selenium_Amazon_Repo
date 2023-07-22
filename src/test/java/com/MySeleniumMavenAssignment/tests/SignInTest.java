package com.MySeleniumMavenAssignment.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.MySeleniumMavenAssignment.pages.SignInPage;

public class SignInTest extends BaseTest {

	private static Logger logger = LogManager.getLogger();

	@Test(priority = 1, groups = { "sanity", "invalid" })
	@Parameters({ "email", "password" })
	public void ValidUserSignIn(String mail, String pass) {

		SignInPage signin = new SignInPage(driver);
		signin.clickSignin();
		signin.enterEmail(mail);
		//signin.Continue();
		//signin.enterPass(pass);
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		logger.info("It is a Amazon Sign In Page");

	}

	@Test(priority = 2, groups = { "sanity", "invalid" })
	@Parameters({ "invalidemail" })
	public void InValidUserSignIn(String mail) {

		SignInPage signin = new SignInPage(driver);
		signin.clickSignin();
		signin.enterEmail(mail);
		signin.Continue();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		logger.info("It is again Amazon Sign In Page");

	}

	@Test(groups = { "sanity", "invalid" })
	@Parameters({ "blank" })
	public void BlankUserSignIn(String blank) {

		SignInPage signin = new SignInPage(driver);
		signin.clickSignin();
		signin.enterEmail(blank);
		signin.Continue();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		logger.info("It is again Amazon Sign In Page");

	}
}
