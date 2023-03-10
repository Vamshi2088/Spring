package com.daolayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.pojo.Car;

public class Extractor implements ResultSetExtractor<Car> {

	@Override
	public Car extractData(ResultSet rs) throws SQLException, DataAccessException {

		Car c=new Car();
		c.setId(rs.getInt(1));
		c.setName(rs.getString(2));
		c.setPrice(rs.getDouble(3));
		
		return c;
	}

	
	
	

}
