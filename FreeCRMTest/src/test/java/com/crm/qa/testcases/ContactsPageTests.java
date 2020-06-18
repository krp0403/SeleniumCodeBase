package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.loginPage;

public class ContactsPageTests extends TestBase {
// we will create objects of the classes that must be invoked or launched in order to reach to the contacts page.
	loginPage LoginPage;
	HomePage homePage;
	ContactsPage contactsPage;


	public ContactsPageTests() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		
		initializer(); // base class function
		LoginPage = new loginPage(); // instantiate objects
		contactsPage= new ContactsPage();// --"--
		homePage= LoginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		// credentials to login to app. Returning homePage object.
	}

	@Test
	public void validateContactsLabelOnPage() {
		
	Assert.assertTrue(contactsPage.ContactsLabel(), "The label is not present");

	}

@AfterMethod
public void tearDown()
{
	driver.quit();
	
}


}