package com.client;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.std.controller.Controll;
import com.std.entity.Student;

public class Client {

	public static void main(String[] args) {

		Student s1=new Student(20, "jio", 503.36, "edla@vamshi");
		ApplicationContext ap= new ClassPathXmlApplicationContext("annotations.xml");
		Controll c= (Controll) ap.getBean("controll");
		c.save(s1);
		
		
		
	}

}
