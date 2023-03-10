 package com.std.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import com.std.entity.Student;
import com.std.service.ServiceDaoImpl;


@Controller
public class Controll { 
	
	public static Logger l=LoggerFactory.getLogger(Controll.class);
	@Autowired
	private ServiceDaoImpl sdi;
	
	public void save(Student s) {
		System.out.println("controller......!");
		sdi.save(s);
		l.info("after controller{}",s);
		l.debug("asdfghjk{} ", s);
	}
	

}
