package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{

	public static long Page_load_TimeOut= 30;
	public static long Page_Implicit_Wait= 20;


	public void switchToFrame() {

		driver.switchTo().frame("mainpanel");
	}
}