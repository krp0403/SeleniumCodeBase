package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{

//lets define the object Factory. Or at least some of the objects on the page to start with.
	
	@FindBy(xpath="//*[@class='ui header item mb5 light-black']")
	WebElement ContactsLabel;

	@FindBy(xpath="//*[text()='Category']")
	WebElement CatagoryLabel;

	//Constructor declaration
	public ContactsPage() {	
		super();// to inherit the base class functions.
		PageFactory.initElements(driver, this);// initializing all the objects defined above.
	}


	// lets create actions

	public boolean ContactsLabel()
	{
		return ContactsLabel.isDisplayed();
		// isDisplayed() function always returns a boolean value.
		
	}
}


