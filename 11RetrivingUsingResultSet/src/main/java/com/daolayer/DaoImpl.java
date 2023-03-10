package com.daolayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.pojo.Car;

@Component("c")
public class DaoImpl implements Dao {

	@Autowired
	private JdbcTemplate jttl;
	
	
	public void setJttl(JdbcTemplate jttl) {
		this.jttl = jttl;
	}


	@Override
	public List<Car> findAll() {

		String all="select * from cars";
		
		List<Car> l=(List<Car>) jttl.queryForRowSet(all, new Extractor());
		
		return l;
	}


	@Override
	public Car getById(int id) {

		String getById="select * from cars where id=?";
		
		Car c = jttl.queryForObject(getById,
				new Object[] {id},
				new BeanPropertyRowMapper<>(Car.class));
		return c;
	}


	@Override
	public Car getByName(String name) {

		String getByName="select * from cars where name=?";
		
	Car c=	jttl.queryForObject(getByName,
				new Object[]{name},
				new BeanPropertyRowMapper<>(Car.class));
		
		return c;
	}

}
