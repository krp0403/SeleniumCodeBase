package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetApiTest2 extends TestBase  {

	TestBase testbase;
	String Serviceurl;
	String apiURL;
	String url;
	RestClient restClient;
	CloseableHttpResponse CloseableResponse;

	@BeforeMethod
	public void testSetup() throws ClientProtocolException, IOException {

		testbase = new TestBase();
		Serviceurl = prop.getProperty("url");
		apiURL = prop.getProperty("serviceURL");

		url = Serviceurl + apiURL;
	}

	@Test
	public void getTest() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		CloseableResponse = restClient.getMethod(url);

		int Statuscode = CloseableResponse.getStatusLine().getStatusCode();
		System.out.println("The response status code is "+Statuscode);
		
		Assert.assertEquals(Statuscode, 200, "Status code is not 200");



		//restClient.getMethod(url);

	} 
}



//####Important#####
//### now if we wish to run the GetApiTest2 class from the qa.tests package then we will have to comment the below code. 
//if not then only the GetApiTest class can be run
// We will get the status code from the response and store it in an integer;

/*int Statuscode = CloseableResponse.getStatusLine().getStatusCode();
System.out.println("The response status code is "+Statuscode);

//We will now get the json String.
String ResponseString = EntityUtils.toString(CloseableResponse.getEntity(),"UTF-8");
JSONObject ResponseToJSON = new JSONObject(ResponseString);//we will parse the response string to a JSON object.




System.out.println("Response JSON file from API is "+ ResponseToJSON); 


//now we will try and get all headers information from the object created.
// the response also has all headers so we will use the responseObject to retrieve all headers and store it in an array.
Header[] headerArray = CloseableResponse.getAllHeaders();
// create a new hashmap to store header values in key & value pair format.

HashMap<String, String> allHeaders = new HashMap	<String, String>();

for (Header header:headerArray) {

	allHeaders.put(header.getName(),header.getValue());
}

System.out.println("Header Array" + allHeaders);



}

 */
