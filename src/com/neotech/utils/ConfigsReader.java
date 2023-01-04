package com.neotech.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	static Properties prop;
	
	/**
this method will need the properties file
@param filePath
	 */
	
	public static void readProperties(String filePath) {
		
		try {
			FileInputStream fileIS = new FileInputStream (filePath);
		    prop = new Properties();
			prop.load(fileIS);
			
			fileIS.close();
			
		} catch (FileNotFoundException e) {
			
		System.out.println("the file path is wrong! ");
		} catch (IOException e) {
	
	     System.out.println("I couldn't read the file!");
	
	    
	    
	 }	
	}
	
	/**
this method will return the value for a spesific key
@param  string key
@return  string value
	 */
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
	public static void readProperties() {
		// TODO Auto-generated method stub
		
	}
}