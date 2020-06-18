package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetApiTests extends TestBase{
	TestBase testbase;
	String Serviceurl;
	String apiURL;
	String url;
	RestClient restClient;

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
		restClient.getMethod(url);

	} 







}
