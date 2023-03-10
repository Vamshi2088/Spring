package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Employe;

public class Client {

	public static void main(String[] args) {

		ApplicationContext ap= new ClassPathXmlApplicationContext("spring.xml");
//		Employe e = (Employe) ap.getBean("b");
//		e.Sum("vamshi");
		Object bean = ap.getBean("r");
		System.out.println(bean);
		
	
	}

}
