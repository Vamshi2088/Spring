package com.client;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.Student;

public class Client {
	
	public static void main(String[] args) {

		Resource r=new ClassPathResource("spring.xml");
        
		BeanFactory bnf= new XmlBeanFactory(r);
		
		Student s = (Student) bnf.getBean("student");
		
//		s.setId(20);
//		s.setName("vamshi");
//		s.setSalary(6523.35);
//		s.setEmail("hggcffxsf");
		
		
		System.out.println(s);
		
		System.out.println("----------------");
		
		Student s2 = bnf.getBean(Student.class);
		System.out.println(s2);
		
		System.out.println("----------------");
		
		Student s3 = bnf.getBean(Student.class,"student");
		System.out.println(s2);
		
		System.out.println("----------------");
		
		String[] aliases = bnf.getAliases("hello");
		
		for (String string : aliases) {
			
			System.out.println(string);
		}
		
		
	}

}
