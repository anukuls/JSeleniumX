package com.testing.SeleniumX.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import java.io.FileInputStream;

public class Properties_Utils {

	public static String get_property(String property_path, String property) {
		
		String prop_value = null;
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
			input = new FileInputStream(property_path);
	 
			// load a properties file
			prop.load(input);
	 
			// get the property value and print it out
			prop_value = prop.getProperty(property);
	 
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return prop_value;
	}
	
	
	public static Set<Object> get_property_keySet(String property_path) {
		
		Set<Object> prop_value = null;
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
//			String workingDir = System.getProperty("user.dir");
//			String path = workingDir+"\\src\\config\\grid.properties";
			input = new FileInputStream(property_path);
	 
			// load a properties file
			prop.load(input);
	 
			// get all the keys in the properties file
			prop_value = prop.keySet();
	 
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return prop_value;
	}
	
}
