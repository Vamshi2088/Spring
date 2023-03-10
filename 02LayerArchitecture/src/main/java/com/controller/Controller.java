package com.controller;

import com.pojo.Person;
import com.services.ServicesImpl;

public class Controller {

	private ServicesImpl s;
	
	
	public void setS(ServicesImpl s) {
		this.s = s;
	}


	public void save(Person p) {
		System.out.println("controller.....!");
		s.save(p);
	}
}
