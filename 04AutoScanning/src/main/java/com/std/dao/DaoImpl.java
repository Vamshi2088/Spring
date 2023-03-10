package com.std.dao;

import org.springframework.stereotype.Repository;

import com.std.entity.Student;

@Repository
public class DaoImpl implements Dao{

	Student s=new Student(1,"hi",452.36,"asdfghjk");
	public void save(Student s) {
		
		System.out.println("Dao....!");
	}

}
