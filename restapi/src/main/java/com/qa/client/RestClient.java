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
	//We will create one get method
	// In this get method we will write such a code that it will call get method 
	// & we get Json response 
	// we have to use HttpClients with create deafault method 
	public void get(String url ) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse closableHttpResponse = httpClient.execute(httpget);// hit the Get URL
		
		//a. Statuscode 
		int statusCode = closableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code----->"+ statusCode );
		
		//to get this entire string response we have method called EnityUtils.tostring(Entity)
		//b. Json String 
		String responseString =EntityUtils.toString(closableHttpResponse.getEntity(), "UTF-8");
	       // nOw we have to convert this response string in to Json method one class is there
		
		JSONObject responejson = new JSONObject(responseString);
		System.out.println("Response JSON from API---------->"+ responejson );
		
		// now how to get header
		//c. All Headers 
		Header[] headerArray =closableHttpResponse.getAllHeaders();
		// now with the help of hasmmap it is easey to put key and value 
		HashMap<String, String> allHeaders = new HashMap<String, String >();
		
		//now i will iterate this array and I will store one by one value in hashmap
		
		for(Header header :headerArray) {
			allHeaders.put(header.getName(), header.getValue());
			
				}
		
		System.out.println("Header Array--->"+ allHeaders);
				
		
		
		
		
	
	}
	

}
