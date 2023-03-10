package com.client;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daolayer.CarDaoImpl;
import com.pojo.Car;

public class Client {

	public static void main(String[] args) {
		
		Car c=new Car(1, "nissan", 600000.00);
		ApplicationContext ap=new ClassPathXmlApplicationContext("jdbctemplate.xml");
		CarDaoImpl cars = (CarDaoImpl) ap.getBean("c");
		
//		System.out.println(cars.getAll());
		
//		System.out.println(cars.getById(2));
		
		System.out.println(cars.getByName("nissan"));
		
	}
}
