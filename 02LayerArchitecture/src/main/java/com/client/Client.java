package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DaoLayer.DaoImpl;
import com.controller.Controller;
import com.pojo.Address;
import com.pojo.Person;

public class Client {
	
	public static void main(String[] args) {
		
		Address a= new Address(504208, "mancherial");
		
		Person p=new Person(20, "vamshi", a);
		
		ApplicationContext x=new ClassPathXmlApplicationContext("spring.xml");

		Controller c = (Controller) x.getBean("controller");
		
		DaoImpl d=x.getBean(DaoImpl.class,"dao");
		
		d.save(p);
		
		c.save(p);
		
	
	}

}
