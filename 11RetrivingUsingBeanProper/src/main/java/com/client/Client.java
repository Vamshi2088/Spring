package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daolayer.DaoImpl;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Anno.xml");
		DaoImpl d=ap.getBean(DaoImpl.class,"c");
//		System.out.println(d.findAll());
		
//		System.out.println(d.getById(2));
		
		System.out.println(d.getByName("nissan"));
	}

}