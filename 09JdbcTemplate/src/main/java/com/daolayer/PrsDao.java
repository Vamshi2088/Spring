package com.daolayer;

import java.util.List;

import com.pojo.Person;

public interface PrsDao {
	
	List<Person> FindAll();
	
	void insert(Person p);

}
