package com.skorpious.utils;

public class URL {
	
	public static final String URL = "http://localhost:8080";
	
	public static String getEndPoint() {
		return URL;
	}

	public static String getEndPoint(String resource) {
		return URL + resource;
	}
	
}
