package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmpDaoImpl;
import com.entity.Employe;

public class Client {
	
	public static void main(String[] args) {
		Employe e=new Employe(1, "swamy", 50000.00);
		ApplicationContext ap= new ClassPathXmlApplicationContext("jdbc.xml");
		      EmpDaoImpl d=(EmpDaoImpl) ap.getBean("dao");
		      d.save(e);
		
	}

}
