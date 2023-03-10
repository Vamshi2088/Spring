package com.daolayer;

import com.pojo.Car;

public interface CarsDAO {

	void insert(Car c);
	void update(Car c);
	void delete(int id);
	
}
