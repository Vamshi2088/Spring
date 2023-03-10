package com.daolayer;

import java.util.List;

import com.pojo.Car;

public interface CarsDAO {

	
	List<Car> getAll(); 
	
	Car getById(int id);
	
	Car getByName(String name);
	
}
