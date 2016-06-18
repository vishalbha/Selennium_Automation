package com.automation.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class readPropertyfile {
	Properties prop;
	public readPropertyfile()
	{
	FileInputStream fileInput = null;
	
		File file = new File("src/lib/data.Properties");
		try {
			 fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }
 	public String addKeyValue(String Key){
 	 return prop.getProperty(Key);
 	
 	}
}
