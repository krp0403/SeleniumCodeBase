//#### Refer to the grid setup notes in notepad++  or e:\selenium\ for more detailed notes.

package GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
	
//##### Define Desired Capabilities
		DesiredCapabilities cap = new DesiredCapabilities ();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
// ##### define chromeOptions class
		
 		ChromeOptions options = new ChromeOptions();
		options.merge(cap); 
// the above command combined the capabilities into the options for chrome.
		
		String hubUrl =  "http://localhost:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);

		driver.get("http://ui.freecrm.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
