package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.loginPage;
import com.crm.qa.pages.HomePage;
public class LoginPageTests extends TestBase {

	loginPage loginPage;//  declaring the variable of the loginPage class To be used through out this class.
	HomePage HomePage;
// initializing the constructor of the class
	public LoginPageTests()
	{
		super();// calling the constructor of the parent class.. (That is theTestBase class.).

	}

	@BeforeMethod
	public void SetUp() {

		initializer(); 
		loginPage = new loginPage();// we have created a constructor of the LoginPage class here.
	}

	@Test
	public void TestPageTitle()
	{// we have already defined the validatePageTitle function in the loginPage.java file in src/java/ folder. We will call it here.
		String Title = loginPage.validatePageTitle();
		Assert.assertEquals(Title, "Cogmento CRM");// validate if the title matches the expected value "cogmento CRM"

	}


	@Test
	public void login() {
		// we have created a object of the HomePage class since the login function defined there will be returning a
		HomePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@AfterMethod
	public void TearDow() {

		driver.quit();
	}
}
