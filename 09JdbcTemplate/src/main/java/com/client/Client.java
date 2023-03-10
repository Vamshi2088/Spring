package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daolayer.PrsDaoImpl;
import com.pojo.Person;

public class Client {

	
	public static void main(String[] args) {
		Person p=new Person(1, "anil", 2500.00);
		ApplicationContext ap=new ClassPathXmlApplicationContext("jdbctemplate.xml");
		 PrsDaoImpl p1=  (PrsDaoImpl) ap.getBean("dao");
		 p1.insert(p);
	}
}
