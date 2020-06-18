package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.loginPage;

public class HomePageTest extends TestBase {

	ContactsPage contactPage;
	loginPage loginPage;	
	HomePage homePage;
	public HomePageTest() {
		super();
	}

	@BeforeMethod()
	public void SetUp()
	{
		initializer();// method from base class to initialize browser
		loginPage = new loginPage();// method from loginPage class in order to login to app.
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));// credentials to login to app. Returning homePage object.
	}


	@Test
	public void HomePageTitleTest()
	{
		String homepage = homePage.PageTitleTest();
		Assert.assertEquals(homepage, "Cogmento CRM","Titles do not match");
		
	}

	public ContactsPage ClickOnContacts()
	{
		homePage.clickOnContactLink();
		return new ContactsPage();
	}


	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
