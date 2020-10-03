package com.skorpious.RestAssuredCore;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import com.skorpious.RestAssuredCore.RESTCalls;
import com.skorpious.utils.PayloadConverter;
import com.skorpious.utils.URL;


public class LoginTest {
	
	Response response;
	
	@Test
	public void doLogin() {
		String loginPayload = PayloadConverter.generatePayloadString("JiraLogin.json");
		
		String endPointURI = URL.getEndPoint("/rest/auth/1/session");
		response = RESTCalls.POSTRequest(loginPayload, endPointURI);
		
		String strResponse = response.getBody().asString();
		System.out.println("**********Response JSON ***************");
		System.out.println(strResponse);
		
		JsonPath jsonRest = new JsonPath(strResponse);
		String sessionID = jsonRest.getString("session.value");
		System.out.println(sessionID);
	}
}
