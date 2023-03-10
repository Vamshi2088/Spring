 package com.ciq.conn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.dao.Dao;
import com.ciq.pojo.Student;

public class ConnectionPool {
	
	
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("curd.xml");
		Dao d = (Dao) c.getBean("d");
		
		//retriving
		
//		System.out.println(d.getAll());
		
		
		//inserting
//		Student s=new Student(5, "balu", 6025.36);
//		d.save(s);
		
		//deleting
//		d.delete(5);
		
		//update 
		Student s=new Student(20, "vamshi", 50.23);
		d.update(s);
		
	}

}
