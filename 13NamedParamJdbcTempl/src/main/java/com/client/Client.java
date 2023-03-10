package com.client;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daolayer.CarDaoImpl;
import com.pojo.Car;

public class Client {

	public static void main(String[] args) {
		
		Car c=new Car(3, "tata", 550000.00);
		ApplicationContext ap=new ClassPathXmlApplicationContext("namedparajdbctemplate.xml");
		CarDaoImpl cars = (CarDaoImpl) ap.getBean("c");

//		cars.insert01(c);
		cars.delete(2);
	}
}
