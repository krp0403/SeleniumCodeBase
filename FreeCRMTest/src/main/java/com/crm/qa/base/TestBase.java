// ##### This is the base class for all the classes in this project (freeCRMTest)

package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;


public class TestBase {
	
	s

	// declaring a public webDriver and properties instance in order to be able to use it throughout the class(es).
	public static WebDriver driver;
	public static Properties prop;	 
	public static EventFiringWebDriver e_driver;
	//public static  eventlistner;
	public TestBase() {

		try {
			System.out.println("test to check if the git works");
			prop = new Properties();// instantiate
			// lets read the properties file using fileinputstream instance.
			FileInputStream ip = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\comfig\\config.properties");
			// lets load the file
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	// ###### This method will initialize the browser and open the test url.
	public static void initializer() {
		String BrowserName = prop.getProperty("browser");

		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","e:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		if(BrowserName.contentEquals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "e:\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		
//		Webdriver firing event definition.

		e_driver = new EventFiringWebDriver(driver);
		WebEventListener eventlistner = new WebEventListener(); 
		e_driver.register(eventlistner);
		driver = e_driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Page_Implicit_Wait, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

}

