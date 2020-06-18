package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	public Properties prop;

	public TestBase() {

		try {
			 prop = new Properties();
			// Now create the object of the file input stream class to connect the java code to the config file at its location as seen below. 
			FileInputStream FP;
			FP = new FileInputStream("C:\\Users\\dell\\workspace\\FirstJavaProject\\src\\SeleniumSessions\\config.properties");
			prop.load(FP);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}}