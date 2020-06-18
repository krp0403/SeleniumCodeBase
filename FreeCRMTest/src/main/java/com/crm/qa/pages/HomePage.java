package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

//	Object repository also called as Object Factory.
	@FindBy(xpath="//*[text()='Home']")
	WebElement Home;

	@FindBy(xpath="//*[text()='Contacts']")
	WebElement Contacts;
	
	
// #### Declaration of the constructor.	
public HomePage() {
	
	PageFactory.initElements(driver, this);
}

//#### lets create some actions for validation

public String PageTitleTest()
{
	return driver.getTitle();
	
}


public ContactsPage clickOnContactLink()
{
	Contacts.click();
	return new ContactsPage();
}

}


