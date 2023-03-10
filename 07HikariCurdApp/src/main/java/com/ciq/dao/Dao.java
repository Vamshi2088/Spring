package com.ciq.dao;

import java.util.List;

import com.ciq.pojo.Student;

public interface Dao {

	List<Student> getAll();
	
	void save(Student std);
	
	void delete(int id);
	
	void update(Student s);
	
	
	
}
