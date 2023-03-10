package com.container;

import java.io.IOException;
import java.util.Properties;

public class Contain {
	
//	public static void getInst(String name) {
//		
//	}
	
	

	public  void Inst(String name) {
		try {
			Properties prop=new Properties();
			prop.load(Contain.class.getClassLoader().getResourceAsStream("com/test/instances.properties"));
			Class.forName(prop.getProperty(name));
			System.out.println("instance is created");
		} catch (ClassNotFoundException | IOException e) {

			e.printStackTrace();
		}
		}
}
