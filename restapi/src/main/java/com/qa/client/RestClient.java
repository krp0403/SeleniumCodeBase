package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {


	//1. Lets create one Get method.

	public CloseableHttpResponse getMethod(String URL) throws ClientProtocolException, IOException {

		// will create one client connection. that is a closable http object
		CloseableHttpClient httpClient = HttpClients.createDefault(); 
		HttpGet httpget = new HttpGet(URL);// we will pass our url to the get mmethod in http.
		CloseableHttpResponse CloseableResponse =	httpClient.execute(httpget); // will hit the url.
		return CloseableResponse;
		
//		####Important#####
//### now if we wish to run the GetApiTest2 class from the qa.tests package then we will have to comment the below code. 
// if not then only the GetApiTest class can be run
		
		
		// We will get the status code from the response and store it in an integer;
		
/*		int Statuscode = CloseableResponse.getStatusLine().getStatusCode();
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
}
}