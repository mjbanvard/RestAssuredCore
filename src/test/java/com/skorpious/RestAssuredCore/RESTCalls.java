package com.skorpious.RestAssuredCore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RESTCalls {
	
//	This class will be responsible to fire requests.
	 
	public static Response GETRequest(String uRI) {
		
		RequestSpecification requestSpecification =  RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.get(uRI);
		return response;
		
	}
	
	public static Response POSTRequest(String uRI, String strJSON) {
		
		RequestSpecification requestSpecification =  RestAssured.given().body(strJSON);
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.post(uRI);
		return response;
	
	}
	
	public static Response PUTRequest(String uRI, String strJSON) {
		
		RequestSpecification requestSpecification =  RestAssured.given().body(strJSON);
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.put(uRI);
		return response;
	
	}
	
	public static Response DELETERequest(String uRI, String strJSON) {
		
		RequestSpecification requestSpecification =  RestAssured.given().body(strJSON);
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.delete(uRI) ;
		return response;
	
	}
}
