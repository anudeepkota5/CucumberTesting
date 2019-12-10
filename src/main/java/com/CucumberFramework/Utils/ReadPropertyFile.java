package com.CucumberFramework.Utils;

import java.io.*;
import java.util.*;

public class ReadPropertyFile {

	/*
	 * 
	 */
	public static String get(String propertyname) {
		
		String returnproperty=null;
		Properties property = new Properties();
		try {
			FileInputStream file = new FileInputStream("./Resources/config.properties");
			property.load(file);
			returnproperty = property.getProperty(propertyname);
			if(returnproperty==null) {
				throw new Exception("Property named "+propertyname+ "not found");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(returnproperty);
		return returnproperty;
		
	}
	
}
