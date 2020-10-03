package com.skorpious.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PayloadConverter {
	
	public static String generatePayloadString(String filename) {
		String filePath = System.getProperty("user.dir")+"\\resources\\"+filename;
		try {
			return new String(Files.readAllBytes(Paths.get(filePath)));
			} catch (IOException e) {
				e.printStackTrace();
				return null;
		}
	}

}
