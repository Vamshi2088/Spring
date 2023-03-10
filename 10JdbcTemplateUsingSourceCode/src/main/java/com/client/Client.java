package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.daolayer.CarDaoImpl;
import com.pojo.Car;

public class Client {

	public static void main(String[] args) {
		
		Car c=new Car(1, "nissan", 600000.00);
		ApplicationContext ap=new AnnotationConfigApplicationContext(Config.class);
		CarDaoImpl cars = (CarDaoImpl) ap.getBean("carDaoImpl");
		
		cars.insert(c);
	}
	
}
