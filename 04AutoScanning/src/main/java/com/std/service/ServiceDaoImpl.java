package com.std.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.std.dao.DaoImpl;
import com.std.entity.Student;

@Service
public class ServiceDaoImpl implements ServiceDao {

	@Autowired
	private DaoImpl d ;
	public void save(Student s) {

		System.out.println("DAo..!");
		d.save(s);
	}

}
