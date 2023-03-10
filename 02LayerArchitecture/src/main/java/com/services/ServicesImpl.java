package com.services;

import com.DaoLayer.DaoImpl;
import com.pojo.Person;

public class ServicesImpl implements Service{

	private DaoImpl d;
	
	public void setD(DaoImpl d) {
		this.d = d;
	}

	public void save(Person p) {

		System.out.println("Service........!");
		d.save(p);
	
	}

	

}
