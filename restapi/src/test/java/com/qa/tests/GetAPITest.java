package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.client.RestClient;

import restapi.TestBase;

public class GetAPITest extends TestBase {
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	
	@BeforeMethod
	public void setup() throws ClientProtocolException, IOException {
		
		// I will call the constructor of baseclass so my properties are initialize 
		testBase = new TestBase();
		String serviceUrl =prop.getProperty("URL");
		String apiUrl = prop.getProperty("serviceURL");
		
		
		 url = serviceUrl + apiUrl;
		//now we have to call get method how you will call simple by Restclient class
		
		
	}
	
	@Test 
	public void getTest() throws ClientProtocolException, IOException {
	    restClient = new RestClient();
		restClient.get(url);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
