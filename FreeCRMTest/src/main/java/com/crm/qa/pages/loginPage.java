package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class loginPage extends TestBase {
	
	// lets create the object repository here for the login page.
	//@findby is a replacement for driver.findelement statement lets see how.
	
	@FindBy(name="email")
	WebElement email;

	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement LoginBtn;

	@FindBy(xpath="//*a[text()='Sign Up']")
	WebElement SignUp;
	
	// create constructor to initialize the elements found above.
	
	public loginPage() {
	// the pagefactory.initElements is the method to initialize the objects in one statement.
	PageFactory.initElements(driver, this);// driver is inherited from base class and this points to current class we are in.
		}

// Lets define the actions on the objects in this class
	
	public String validatePageTitle() {
		
		return driver.getTitle();
	}

// lets try to login. And pay attention that after the login button click action the page navigates to homepage so the 
// the function should return the a new object or the home page class.

	public HomePage login(String un, String pwd) {

		email.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
	
		return new HomePage();
	}


}
