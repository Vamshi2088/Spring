package com.daolayer;

import java.util.List;

import com.pojo.Car;

public interface Dao {
	
	List<Car> findAll();

	Car getById(int id);
	
	Car getByName(String name);
}
